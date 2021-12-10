/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.myblog.interfaces;

import java.util.HashMap;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

/**
 *
 * @author vilewalker
 */
@Consumes({"application/json"})
@Produces({"application/json"})
public interface CustomerControllerInterface {
    
    //HashMap<Integer, Integer> customerAccount = new HashMap<>();
       
    public void createAccount(Integer customerID);
    
    public void lodgeAccount(Integer customerID, Integer accountID, Integer amount);
    
    public void transferToAccount(Integer customerID, Integer accountID, Integer amount);
    
    public void withdrawFromAccount(Integer customerID, Integer accountID, Integer amount);
    
    public Integer getAccountBalance(Integer customerID, Integer accountID);
}
