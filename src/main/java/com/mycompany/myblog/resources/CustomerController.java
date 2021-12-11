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
    @Path("{custID}")
    public void createAccount(@PathParam("custID")Integer custID) { 
    }
    
    @POST
    @Override
    @Path("{custID}/{accountID}")
    public void lodgeAccount(@PathParam("custID")Integer custID, @PathParam("accountID")Integer accountID, Integer amount) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @POST
    @Override
    @Path("{custID}/{accountID}")
    public void transferToAccount(@PathParam("custoID")Integer customerID, @PathParam("accountID")Integer accountID, Integer amount) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    }
    

