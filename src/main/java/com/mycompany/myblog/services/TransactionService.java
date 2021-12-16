/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.myblog.services;

import com.mycompany.myblog.models.Account;
import com.mycompany.myblog.models.Customer;
import com.mycompany.myblog.models.Transaction;
import com.mycompany.myblog.models.Transfer;
import com.mycompany.myblog.repository.Database;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author cjMosawan
 */
public class TransactionService {
    Database database = new Database();
    AccountService accountService = new AccountService();
    CustomerService customerService = new CustomerService();
    private List<Transaction> transactionList = database.getTransactionDB();
    String localDate =  LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-yy"));
    
//    public Transaction createTransaction(Integer accountID, Transaction transaction){
//        
//        
//        Integer transactionIDInt = transactionList.size()+1;
//        Account account = accountService.getAccount(accountID);
//        account.getAccountTransaction().add(transaction);
//        
//        transactionList.add(transaction);
//        
//        return transaction;
//    }
    
    public Transaction createTransaction(String transactionDescription, Integer transactionPostBalance, Integer accountID){
        
        
        Integer transactionIDInt = transactionList.size()+1;
        
        Transaction transaction = new Transaction(transactionIDInt,  localDate, transactionDescription, transactionPostBalance, accountID);
        Account account = accountService.getAccount(accountID);
        account.getAccountTransaction().add(transaction);
        
        return transaction;
    }
    
    public List<Transaction> getAllTransactions(){
        return transactionList;
    }
    
    
    
    public Transaction accountDeposit(Transfer transfer){
           
        Integer transferAccountID = transfer.getAccountID();
        Integer amount = transfer.getAmount();
        String type;
        if(transfer.getIsDeposit()){
            type = "Deposit";
        } else type = "";
        Account account = accountService.getAccount(transferAccountID);
        Integer newBalance = account.getAccountBalance() + amount;
        account.setAccountBalance(newBalance);
        
        Transaction transaction = createTransaction(type, newBalance, transferAccountID);
        
        return transaction;
    }
    
    
    
    
    public void accountTransferToAccount(Transfer transfer){
        
        
        Customer customer = customerService.getCustomerByID(transfer.getCustomerID());
        
        Account account1 = null, account2 = null;
        List<Account> customerAccounts = customer.getAccounts();
        for(int i=0; i< customerAccounts.size();i++){
            if ((Objects.equals(customerAccounts.get(i).accountID, transfer.getAccountID()))){
                account1 = customerAccounts.get(i);
            } else if ((Objects.equals(customerAccounts.get(i).accountID, transfer.getAccountID2()))){
                account2 = customerAccounts.get(i);
            }
        }
       
        Integer amount = transfer.getAmount();
       
        Integer bal1, bal2, balA, balB;
        bal1 = account1.getAccountBalance();
        bal2 = account2.getAccountBalance();
        
        balA = bal1-amount;
        balB = bal2+amount;
        
        account1.setAccountBalance(balA);
        account2.setAccountBalance(balB);
        
        Transaction transaction1 = createTransaction("Withdrawal",balA,transfer.getAccountID());
        Transaction transaction2 = createTransaction("Deposit",balB,transfer.getAccountID2());
        }
}
