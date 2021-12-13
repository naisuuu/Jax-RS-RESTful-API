/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.myblog.resources;

import com.mycompany.myblog.models.Account;
import com.mycompany.myblog.services.AccountService;
import java.util.List;
import java.util.stream.Stream;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
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
@Path("customer/accounts")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class AccountController {
    
    AccountService accountService = new AccountService();
    
    @POST
    @Path("/customerID/{customerID}")
    public void createAccount(@PathParam("customerID")Integer customerID, @FormParam("accountType")String accountType, @FormParam("accountBalance")Integer accountBalance) { 
         accountService.createAccount(customerID, accountType, accountBalance);
    }
    
    @GET
    @Path("/")
    public List<Account> getAccounts(){
        return accountService.getAllAccounts();
    }
    
    @GET
    @Path("/{accountID}")
    public Account getAccount(@PathParam("accountID")Integer accountID){
        return accountService.getAccount(accountID);
    }
    
    @GET
    @Path("/customerID/{customerID}/accountID/{accountID}")
    public Account getAccountByID(@PathParam("customerID")Integer customerID,@PathParam("accountID")Integer accountID){
        return accountService.getAccountByCustomerIDAndAccountID(customerID,accountID);
    }
    
    
}
