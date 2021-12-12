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

@Data
public class Transaction {
    private String transactionType;
    private String transactionDate;
    private String transactionDescription;
    private Integer transactionPostBalance;
    private Integer accountID;

    public Transaction(String transactionType, String transactionDate, String transactionDescription, Integer transactionPostBalance, Integer accountID) {
        this.transactionType = transactionType;
        this.transactionDate = transactionDate;
        this.transactionDescription = transactionDescription;
        this.transactionPostBalance = transactionPostBalance;
        this.accountID = accountID;
    }
    
    
}
