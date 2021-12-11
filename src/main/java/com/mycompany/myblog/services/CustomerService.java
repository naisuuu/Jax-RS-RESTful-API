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
    private List<Customer> list = d.getCustomerDB();
        
    public List<Customer> getAllCustomers() {
        return list;
    }
    
     public Customer getCustomer(int custID) {
        return list.get(custID-1);
    }  
     
     public Customer createCustomer(Customer c) {
	c.setCustID(list.size() + 1);
      	list.add(c);
	System.out.println("201 - resource created with path: /customers/" + String.valueOf(c.getCustID()));
        
	return c;
    }
     
     public List<Customer> getSearchCustomers(int custID, String custName, String custAddress,String custEmail, String custPassword, List<Account>accounts) {
        List<Customer> matcheslist = new ArrayList<>();
        
        for (Customer q: getAllCustomers()) {
            if ((custName == null || q.getCustName().equals(custName)) 
                   && (custAddress == null || q.getCustAddress().equals(custAddress))) {
               matcheslist.add(q);
            }
        }
        return matcheslist;
    }
}
