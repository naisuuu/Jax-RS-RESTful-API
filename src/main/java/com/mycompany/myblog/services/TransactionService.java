/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.myblog.services;

import com.mycompany.myblog.models.Account;
import com.mycompany.myblog.models.Transaction;
import com.mycompany.myblog.repository.Database;
import java.util.List;

/**
 *
 * @author vilewalker
 */
public class TransactionService {
    Database database = new Database();
    AccountService accountService;
    private List<Transaction> transactionList = database.getTransactionDB();
    
    public Transaction createTransaction(String transactionDate, String transactionDescription, Integer transactionPostBalance, Integer accountID){
        
        
        Integer transactionIDInt = transactionList.size()+1;
        
        Transaction transaction = new Transaction(transactionIDInt,  transactionDate, transactionDescription, transactionPostBalance, accountID);
        transactionList.add(transaction);
        
        return transaction;
    }
}
