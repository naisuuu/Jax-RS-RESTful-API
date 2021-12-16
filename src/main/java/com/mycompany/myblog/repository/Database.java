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
 * @author cjMosawan
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
          List<Account> list1 = new ArrayList();
          List<Account> list2 = new ArrayList();
          List<Account> list3 = new ArrayList();
        // Create some Customers
        Customer c1 = new Customer (1, "Name1","Address","Email.com","password",list1); 
        Customer c2 = new Customer (2, "Name2","Address","Email.com","password",list2);  
        Customer c3 = new Customer (3, "Name3","Address","Email.com","password",list3);  
     
        
        customerDB.add(c1);
        customerDB.add(c2);
        customerDB.add(c3);
     
        
        // Add those Customers to each of the messages. 
        // Keep in mind ALL messages will contain same list of seeded Customers!!!
        List<Transaction> acc1List = new ArrayList();
        List<Transaction> acc2List = new ArrayList();
        List<Transaction> acc3List = new ArrayList();
        List<Transaction> acc4List = new ArrayList();
        Account m1 = new Account(1,1,"DSGFDH","Savings",300,acc1List);
        Account m2 = new Account(1,2,"GJVJGV","Savings",300,acc2List);
        Account m3 = new Account(2,3,"JCKCKH","Savings",300,acc3List);
        Account m4 = new Account(3,4,"VTCTCT","Savings",300,acc4List);
      
        list1.add(m1);
        list1.add(m2);
        list2.add(m3);
        list3.add(m4);
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
