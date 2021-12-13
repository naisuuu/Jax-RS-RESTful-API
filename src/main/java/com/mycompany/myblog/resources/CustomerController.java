/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.myblog.resources;


import com.mycompany.myblog.models.Customer;
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
    
    
    
    @POST
    @Path("{customerID}/{accountIDSend}/{accountIDReceive}")
    public String transferToAccount(@PathParam("customerID")Integer customerID, @PathParam("accountIDSend")Integer accountID,@PathParam("accountIDReceive")Integer accountID2, Integer amount) {
        return accountService.accountTransferToAccount(accountID, accountID2, amount);
    }

    @POST
    @Path("{customerID}/{accountID}")
    public void depositToAccount(@PathParam("customerID")Integer customerID, @PathParam("accountID")Integer accountID, Integer amount) {
           accountService.accountDeposit(accountID, amount);
    }

    }
    

