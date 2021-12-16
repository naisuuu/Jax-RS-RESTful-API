/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.myblog.services;

import com.mycompany.myblog.models.Account;
import com.mycompany.myblog.models.Customer;
import com.mycompany.myblog.models.Transaction;
import com.mycompany.myblog.repository.Database;
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
    
    
    public Account createAccount(int customerID, Account account){
        
        List<Transaction> accountTransactions = null;
        
        Integer accountIDInt = accountList.size()+1;
        String accountSortCode = accountIDInt+"SC";
        //Account holds a list of its own transactions which will be uploaded to 'Transaction database'
        Customer customer = customerService.getCustomerByID(customerID);
        customer.getAccounts().add(account);      
        //customer.addAccountToCustomer(account);
        
        account.setAccountID(accountIDInt);
        account.setAccountSortCode(accountSortCode);
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
    
    public List<Account> getAllAccountsByCustomerID(Integer customerID){
        Customer customer = customerService.getCustomerByID(customerID);
        return customer.getAccounts();
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
   
}
