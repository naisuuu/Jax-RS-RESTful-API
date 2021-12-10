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
    private Boolean transactionDebit;
    private Boolean transactionCredit;
    private Date transactionDate;
    private String transactionDescription;
    private Integer transactionPostBalance;
}
