/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.myblog.repository;


import com.mycompany.myblog.models.Account;
import com.mycompany.myblog.models.Customer;
import com.mycompany.myblog.models.Transaction;
import java.util.ArrayList;
import java.util.List;
//import static jdk.internal.vm.compiler.word.LocationIdentity.init;

/**
 *
 * @author vilewalker
 */
public class Database {
    //3 arraylists - 1 for each model
    public static List<Customer> customerDB = new ArrayList<>();
    public static List<Account> accountDB = new ArrayList<>();
    public static List<Transaction> transactionDB = new ArrayList<>();
    public static boolean init = true;
    
    //Construtor

    public Database() {
        if (init) {
          
        // Create some Customers
        Customer c1 = new Customer (1, "Name1","Address","Email.com","password",accountDB);  
        Customer c2 = new Customer (2, "Name2","Address","Email.com","password",accountDB);  
        Customer c3 = new Customer (3, "Name3","Address","Email.com","password",accountDB);  
     
        
        customerDB.add(c1);
        customerDB.add(c2);
        customerDB.add(c3);
     
        
        // Add those Customers to each of the messages. 
        // Keep in mind ALL messages will contain same list of seeded Customers!!!
        Account m1 = new Account(1,1,"DSGFDH","Savings",300,transactionDB);
        Account m2 = new Account(1,2,"GJVJGV","Savings",300,transactionDB);
        Account m3 = new Account(2,3,"JCKCKH","Savings",300,transactionDB);
        Account m4 = new Account(3,4,"VTCTCT","Savings",300,transactionDB);
      
        
        accountDB.add(m1);
        accountDB.add(m2);
        accountDB.add(m3);
        accountDB.add(m4);

       // accountDB.add(m4);
       // accountDB.add(m5);
        
        init = false;
     }
    }

   
    public static List<Customer> getcustomerDB() {
        return customerDB;
    }
    
    public static List<Account> getAccountDB() {
        return accountDB;
    }
    
    public static List<Transaction> getTransactionDB(){
        return transactionDB;
    }
}
