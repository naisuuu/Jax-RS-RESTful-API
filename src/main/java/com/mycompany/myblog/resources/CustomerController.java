/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.myblog.resources;


import com.mycompany.myblog.models.Account;
import com.mycompany.myblog.models.Customer;
import com.mycompany.myblog.models.Transaction;
import com.mycompany.myblog.services.AccountService;
import com.mycompany.myblog.services.CustomerService;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author vilewalker
 */
@Path("/customers")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class CustomerController {
    
    private CustomerService customerService = new CustomerService();
    private AccountService accountService = new AccountService();
    
    @GET
    @Path("/")
    public List<Customer> getAllCustomers() { 
        return customerService.getAllCustomers();
    }
    
    @GET
    @Path("/{customerID}")
    public Customer getCustomerByID(@PathParam("customerID")Integer customerID){
        return customerService.getCustomerByID(customerID);
    }
    
    @GET
    @Path("/{customerID}/accounts/")
    public List<Account> getCustomerAccountsByID(@PathParam("customerID")Integer customerID){
        return customerService.getAllCustomerAccountsByCustomerID(customerID);
    }
    
    @POST
    @Path("/create/")
    public Response createCustomer(Customer c){
         customerService.createCustomer(c);
         return Response.ok().entity(c).build();
    }
    


    }
    

