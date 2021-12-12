/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.myblog.resources;

import com.mycompany.myblog.models.Account;
import com.mycompany.myblog.services.AccountService;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author vilewalker
 */
@Path("/accounts")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class AccountController {
    
    AccountService accountService;
    
    @POST
    @Path("{customerID}")
    public void createAccount(@PathParam("customerID")Integer customerID, String accountType, Integer accountBalance) { 
         accountService.createAccount(customerID, accountType, accountBalance);
    }
    
    @GET
    @Path("{customerID}")
    public List<Account> getAccounts(@PathParam("customerID")Integer customerID){
        return accountService.getAllAccounts();
    }
    
    
}
