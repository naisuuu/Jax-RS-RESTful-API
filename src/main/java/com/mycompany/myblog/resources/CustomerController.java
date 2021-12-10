/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.myblog.resources;

import com.mycompany.myblog.interfaces.CustomerControllerInterface;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

/**
 *
 * @author vilewalker
 */
public class CustomerController implements CustomerControllerInterface{

    @POST
    @Override
    @Path("{customerID}")
    public void createAccount(@PathParam("customerID")Integer customerID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @POST
    @Override
    @Path("{customerID}/{accountID}")
    public void lodgeAccount(@PathParam("customerID")Integer customerID, @PathParam("accountID")Integer accountID, Integer amount) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @POST
    @Override
    @Path("{customerID}/{accountID}")
    public void transferToAccount(@PathParam("customerID")Integer customerID, @PathParam("accountID")Integer accountID, Integer amount) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @PUT //Put appropriate?
    @Override
    @Path("{customerID}/{accountID}")
    public void withdrawFromAccount(@PathParam("customerID")Integer customerID, @PathParam("accountID")Integer accountID, Integer amount) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @GET
    @Override
    @Path("{customerID}/{accountID}")
    public Integer getAccountBalance(@PathParam("customerID")Integer customerID, @PathParam("accountID")Integer accountID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
