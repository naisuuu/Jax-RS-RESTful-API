/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.myblog.services;

import com.mycompany.myblog.models.Account;
import com.mycompany.myblog.models.Customer;
import com.mycompany.myblog.repository.Database;
import static com.mycompany.myblog.repository.Database.customerDB;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author vilewalker
 */
public class CustomerService {
    // needs some sorta logic
    // Call db    
     Database d = new Database();
    private List<Customer> customerList = d.getcustomerDB();
        
    
    public List<Customer> getAllCustomers() {
        return customerList;
    }
    
     public Customer getCustomer(Integer customerID){
        Customer customer = (Customer) customerList
                .stream()
                .filter(p -> p.getCustID().equals(customerID));
       return customer;
    }
     
     public Customer createCustomerID(Customer c) {
	c.setCustID(customerList.size() + 1);
      	customerList.add(c);
	System.out.println("201 - resource created with path: /customers/" + String.valueOf(c.getCustID()));
        
	return c;
    }
         
     public List<Customer> getSearchCustomers(int custID, String custName, String custAddress,String custEmail, String custPassword, List<Account>accounts) {
        List<Customer> matchescustomerList = new ArrayList<>();
        
        for (Customer q: getAllCustomers()) {
            if ((custName == null || q.getCustName().equals(custName)) 
                   && (custAddress == null || q.getCustAddress().equals(custAddress))) {
               matchescustomerList.add(q);
            }
        }
        return matchescustomerList;
    }
}
