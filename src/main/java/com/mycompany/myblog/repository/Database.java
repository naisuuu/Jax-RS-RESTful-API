/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.myblog.repository;


import com.mycompany.myblog.models.Account;
import com.mycompany.myblog.models.Customer;
import java.util.ArrayList;
import java.util.List;
import static jdk.internal.vm.compiler.word.LocationIdentity.init;

/**
 *
 * @author vilewalker
 */
public class Database {
    //3 arraylists - 1 for each model
    public static List<Customer> customerDB = new ArrayList<>();
    public static List<Account> accountDB = new ArrayList<>();
    
    //Construtor

    public Database() {
    }

   
    public static List<Customer> getCustomerDB() {
        return customerDB;
    }
    
    public static List<Account> getAccountDB() {
        return accountDB;
    }
}
