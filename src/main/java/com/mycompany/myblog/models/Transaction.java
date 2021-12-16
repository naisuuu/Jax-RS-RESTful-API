    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.myblog.models;

import java.util.Date;
import lombok.Data;

/**
 *
 * @author vilewalker
 */

public class Transaction {
    public Integer transactionID;
    private String transactionDate;
    private String transactionDescription;
    private Integer transactionPostBalance;
    private Integer accountID;
    
    public Transaction(){}

    
    public Transaction(Integer transactionID, String transactionDate, String transactionDescription, Integer transactionPostBalance, Integer accountID) {
        this.transactionID = transactionID;
        this.transactionDate = transactionDate;
        this.transactionDescription = transactionDescription;
        this.transactionPostBalance = transactionPostBalance;
        this.accountID = accountID;
    }

    public Integer getTransactionID() {
        return transactionID;
    }

    public void setTransactionID(Integer transactionID) {
        this.transactionID = transactionID;
    }

    public String getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(String transactionDate) {
        this.transactionDate = transactionDate;
    }

    public String getTransactionDescription() {
        return transactionDescription;
    }

    public void setTransactionDescription(String transactionDescription) {
        this.transactionDescription = transactionDescription;
    }

    public Integer getTransactionPostBalance() {
        return transactionPostBalance;
    }

    public void setTransactionPostBalance(Integer transactionPostBalance) {
        this.transactionPostBalance = transactionPostBalance;
    }

    public Integer getAccountID() {
        return accountID;
    }

    public void setAccountID(Integer accountID) {
        this.accountID = accountID;
    }
    
    
    
}
