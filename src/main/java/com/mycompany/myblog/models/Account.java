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

@Data
public class Account {
    public int customerID;
    public Integer accountID;
    private String accountSortCode;
    private String accountType;
    private Integer accountBalance;
    private List<Transaction> accountTransaction;
    
    public Account(){
        
    }

    public Account(int customerID, Integer accountID, String accountSortCode, String accountType, Integer accountBalance, List<Transaction> accountTransaction) {
        this.customerID = customerID;
        this.accountID = accountID;
        this.accountSortCode = accountSortCode;
        this.accountType = accountType;
        this.accountBalance = accountBalance;
        this.accountTransaction = accountTransaction;
    }

    }
