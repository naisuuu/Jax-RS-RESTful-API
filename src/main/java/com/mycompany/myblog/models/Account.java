/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.myblog.models;

import java.util.List;


/**
 *
 * @author vilewalker
 */


public class Account {
    private String accountSortCode;
    private String accountType;
    private Integer accountNumber;
    private Integer accountBalance;
    
    private List<Transaction> accountTransactions;

    public Account(String accountSortCode, String accountType, Integer accountNumber, Integer accountBalance, List<Transaction> accountTransactions) {
        this.accountSortCode = accountSortCode;
        this.accountType = accountType;
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.accountTransactions = accountTransactions;
    }
    
    public String getAccountSortCode() {
        return accountSortCode;
    }

    public void setAccountSortCode(String accountSortCode) {
        this.accountSortCode = accountSortCode;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public Integer getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Integer accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Integer getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(Integer accountBalance) {
        this.accountBalance = accountBalance;
    }

    public List<Transaction> getAccountTransactions() {
        return accountTransactions;
    }

    public void setAccountTransactions(List<Transaction> accountTransactions) {
        this.accountTransactions = accountTransactions;
    }
    
    
    }
