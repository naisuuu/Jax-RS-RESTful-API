/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.myblog.services;

import com.mycompany.myblog.models.Account;
import com.mycompany.myblog.models.Transaction;
import com.mycompany.myblog.repository.Database;
import java.util.Date;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author vilewalker
 */
public class AccountService {
    Database database = new Database();
    TransactionService transactionService;
    
    private List<Account> accountList = database.getAccountDB();
    private List<Transaction> transactionList = database.getTransactionDB();
    
    public Account createAccount(int customerID, Integer accountID, String accountSortCode, String accountType, int accountBalance, List<Transaction> accountTransactions){
        
        Integer accountIDInt = accountList.size()+1;
      
        Account account = new Account(customerID,  accountIDInt, accountSortCode, accountType,  accountBalance, transactionList);
        accountList.add(account);
        return account;
    }
     
    public Account getAccount(Integer accountID){
        
        Account account = (Account) accountList
                .stream()
                .filter(p -> p.accountID.equals(accountID));
       return account;
    }
    
    
}
