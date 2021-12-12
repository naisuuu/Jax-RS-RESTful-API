/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.myblog.resources;


import com.mycompany.myblog.models.Customer;
import com.mycompany.myblog.services.CustomerService;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

/**
 *
 * @author vilewalker
 */
public class CustomerController {
    
    CustomerService customerservice;
    
    @GET
    @Path("/")
    public List<Customer> getCustomer(@PathParam("customerID")Integer customerID) { 
        return customerservice.getAllCustomers();
    }
    
    
    @POST
    @Path("{customerID}")
    public void createAccount(@PathParam("customerID")Integer customerID) { 
        
    }
    
    @POST
    @Path("{customerID}/{accountID}")
    public void lodgeAccount(@PathParam("customerID")Integer customerID, @PathParam("accountID")Integer accountID, Integer amount) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @POST
    @Path("{customerID}/{accountID}")
    public void transferToAccount(@PathParam("customerID")Integer customerID, @PathParam("accountID")Integer accountID, Integer amount) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    }
    

