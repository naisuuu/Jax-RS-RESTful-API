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
    private String accountSortCode;
    private Integer accountNumber;
    private Integer accountBalance;
    
    private List<Transaction> accountTransactions;
    }
