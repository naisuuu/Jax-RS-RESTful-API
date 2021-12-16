/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.myblog.models;

import java.util.List;
import lombok.Data;


/**
 *
 * @author vilewalker
 */


public class Account {
    public Integer customerID;
    public Integer accountID;
    private String accountSortCode;
    private String accountType;
    private Integer accountBalance;
    private List<Transaction> accountTransaction;
    
    public Account(){
        
    }

    public Integer getCustomerID() {
        return customerID;
    }

    public void setCustomerID(Integer customerID) {
        this.customerID = customerID;
    }

    public Integer getAccountID() {
        return accountID;
    }

    public void setAccountID(Integer accountID) {
        this.accountID = accountID;
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

    public Integer getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(Integer accountBalance) {
        this.accountBalance = accountBalance;
    }

    public List<Transaction> getAccountTransaction() {
        return accountTransaction;
    }

    public void setAccountTransaction(List<Transaction> accountTransaction) {
        this.accountTransaction = accountTransaction;
    }

    
    public Account(Integer customerID, Integer accountID, String accountSortCode, String accountType, Integer accountBalance, List<Transaction> accountTransaction) {
        this.customerID = customerID;
        this.accountID = accountID;
        this.accountSortCode = accountSortCode;
        this.accountType = accountType;
        this.accountBalance = accountBalance;
        this.accountTransaction = accountTransaction;
    }
}
