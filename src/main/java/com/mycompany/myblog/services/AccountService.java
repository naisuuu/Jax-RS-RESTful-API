/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.myblog.services;

import com.mycompany.myblog.models.Account;
import com.mycompany.myblog.models.Customer;
import com.mycompany.myblog.models.Transaction;
import com.mycompany.myblog.repository.Database;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author vilewalker
 */
public class AccountService {
    Database database = new Database();
    TransactionService transactionService;
    
    CustomerService customerService = new CustomerService();
    
    private List<Account> accountList = database.getAccountDB();
    private List<Transaction> accountTransactionList;
    private List transactionListDB = database.getTransactionDB();
    
    String localDate =  LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
    
    public Account createAccount(int customerID,String accountType, int accountBalance){
        
        List<Transaction> accountTransactions = null;
        
        Integer accountIDInt = accountList.size()+1;
        String accountSortCode = accountIDInt+"SC";
        //Account holds a list of its own transactions which will be uploaded to 'Transaction database'
        Account account = new Account(customerID,  accountIDInt, accountSortCode, accountType,  accountBalance, accountTransactions);
        Customer customer = customerService.getCustomerByID(customerID);
        customer.getAccounts().add(account);      
        accountList.add(account);
        return account;
    }
    
    public Account createAccount(int customerID, Account account){
        
        List<Transaction> accountTransactions = null;
        
        account.setAccountID(accountList.size()+1);
        accountList.add(account);
        return account;
    }
     
    public Account getAccount(Integer accountID){
        Account accountResult = null;
        Iterator<Account> accItr = accountList.iterator();
        while(accItr.hasNext()){
            Account account = accItr.next();
            if(account.getAccountID().equals(accountID)){
                accountResult = account;
            }
        }
        return accountResult;
    }
    public Account getAccountByCustomerIDAndAccountID(Integer customerID, Integer accountID) {
        Account matchAccount = getAccount(accountID);
        Customer customer = customerService.getCustomerByID(customerID);
        if(customer.getAccounts().contains(matchAccount)){
    Optional<Account> account = accountList.stream()
            .filter(a -> a.getAccountID().equals(accountID))
            .findFirst();
    return account.isPresent() ? account.get() : null;}
        else return null;// Instead of null you can also return empty Employee Object
}
    
    
    public List<Account> getAllAccounts(){
        return accountList;
    }
    
    //Post
    public String accountDeposit(Integer accountID, Integer amount){
        
        
        Account account = getAccount(accountID);
        Integer newBalance = account.getAccountBalance() + amount;
        account.setAccountBalance(newBalance);
        
        Transaction transaction = transactionService.createTransaction(localDate, "Deposit", newBalance, accountID);
        account.getAccountTransaction().add(transaction);
        
        return "New Balance: \n"+account.getAccountBalance();
    }
    
    public String accountTransferToAccount(Integer accountSenderID, Integer accountReceiverID, Integer amount){
        
        
        Account accountSender = getAccount(accountSenderID);
        Account accountReceiver = getAccount(accountReceiverID);
        
        if(accountSender.getCustomerID() == accountReceiver.getCustomerID()){
            Integer accountSenderPreBal = accountSender.getAccountBalance();
            Integer accountReceiverPreBal = accountReceiver.getAccountBalance();

            //Process of transfer
            accountSender.setAccountBalance(accountSenderPreBal-amount);
            accountReceiver.setAccountBalance(accountReceiverPreBal+amount);

            Transaction transactionSend = transactionService.createTransaction(localDate, "Send", accountSenderPreBal-amount, amount);
            Transaction transactionReceive = transactionService.createTransaction(localDate, "Receive", accountReceiverPreBal-amount, amount);
            accountSender.getAccountTransaction().add(transactionSend);
            accountReceiver.getAccountTransaction().add(transactionReceive);

            return "Amount transferred: "+amount+"\nSender Balance: "+ accountSenderPreBal+" to "+(accountSenderPreBal-amount)
                    +"\nReceiver Balance: "+accountReceiverPreBal+" to "+(accountReceiverPreBal-amount);
        } else return "An error has occured";
    }
}
