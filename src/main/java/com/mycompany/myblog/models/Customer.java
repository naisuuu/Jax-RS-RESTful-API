/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.myblog.models;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author cjMosawan
 */

public class Customer {
    public Integer custID;
    private String custName;
    private String custAddress;
    private String custEmail;
    private String custPassword;
    private List<Account> accounts = new ArrayList<>();
    
    
    public Customer(){
    }
    
    public Customer(int custID, String custName, String custAddress,String custEmail, String custPassword, List<Account>accounts){
        this.custID = custID;
        this.custName = custName;
        this.custAddress = custAddress;
        this.custEmail = custEmail;
        this.custPassword = custPassword;
        this.accounts = accounts;  
    }
    
    //Hold accounts?
    //Account[] customerAccounts;

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getCustAddress() {
        return custAddress;
    }

    public void setCustAddress(String custAddress) {
        this.custAddress = custAddress;
    }

    public String getCustEmail() {
        return custEmail;
    }

    public void setCustEmail(String custEmail) {
        this.custEmail = custEmail;
    }

    public String getCustPassword() {
        return custPassword;
    }

    public void setCustPassword(String custPassword) {
        this.custPassword = custPassword;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }

    public Integer getCustID() {
        return custID;
    }

    public void setCustID(Integer custID) {
        this.custID = custID;
    }
    
    
}
