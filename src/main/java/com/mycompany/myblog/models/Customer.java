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
public class Customer {
    String customerName;
    String customerAddress;
    String customerEmail;
    String customerPassword;
    
    //Hold accounts?
    Account[] customerAccounts;
}
