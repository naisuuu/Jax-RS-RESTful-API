/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.myblog.models;

import lombok.Data;

/**
 *
 * @author vilewalker
 */
@Data
public class Transfer {
    Integer customerID;
    Integer accountID;
    Integer accountID2;
    Integer amount;
    Boolean isDeposit;

    //Transfer between account
    public Transfer(Integer customerID, Integer accountID, Integer accountID2, Integer amount, Boolean isDeposit) {
        this.customerID = customerID;
        this.accountID = accountID;
        this.accountID2 = accountID2;
        this.amount = amount;
        this.isDeposit = isDeposit;
    }

    //Deposit to account
    public Transfer(Integer customerID, Integer accountID, Integer amount, Boolean isDeposit) {
        this.customerID = customerID;
        this.accountID = accountID;
        this.amount = amount;
        this.isDeposit = isDeposit;
    }

    public Transfer(Integer accountID, Integer amount, Boolean isDeposit) {
        this.accountID = accountID;
        this.amount = amount;
        this.isDeposit = isDeposit;
    }

    public Transfer(){}
}

