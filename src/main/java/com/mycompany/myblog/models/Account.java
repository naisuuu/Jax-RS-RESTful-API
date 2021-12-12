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
    private int accountBalance;
    private List<Transaction> accountTransactions;

    public Account(int customerID, Integer accountID, String accountSortCode, String accountType, int accountBalance, List<Transaction> accountTransactions) {
        this.customerID = customerID;
        this.accountID = accountID;
        this.accountSortCode = accountSortCode;
        this.accountType = accountType;
        this.accountBalance = accountBalance;
        this.accountTransactions = accountTransactions;
    }

    }
