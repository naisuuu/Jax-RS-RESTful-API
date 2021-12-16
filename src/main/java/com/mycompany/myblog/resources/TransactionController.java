/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.myblog.resources;

import com.mycompany.myblog.models.Transaction;
import com.mycompany.myblog.models.Transfer;
import com.mycompany.myblog.services.AccountService;
import com.mycompany.myblog.services.TransactionService;
import javax.ws.rs.Consumes;
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
@Path("customers/transactions/")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class TransactionController {
    
    TransactionService transactionService = new TransactionService();
    
    @POST
    @Path("/transfer/{customerID}")
    public Response transferToAccount(@PathParam("customerID")Integer customerID,Transfer transfer) {
        transactionService.accountTransferToAccount(transfer);
        return Response.ok().entity("Request Sent").build();
    }

    @POST
    @Path("deposit/{customerID}")
    public Response depositToAccount(@PathParam("customerID")Integer customerID, Transfer transfer) {
           transactionService.accountDeposit(transfer);
           return Response.ok().entity("Request Sent").build();
    }
}
