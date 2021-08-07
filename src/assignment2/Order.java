/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

/**
 *
 * @author chunc
 */
public class Order { 

    private String date; 

    private int orderId; 

    private int custId; 

     

    public Order(String date, int cid, double total) { 
 

        this.date = date; 

        this.orderId = orderId;

        this.custId = custId; 

         

    } 

     

    public int getOrderId() { 

        return this.orderId; 

    } 

     

    public int getCustId() { 

        return this.custId; 

    } 

     

    public void ordInfo() { 

        System.out.println("Date: " + this.date); 

        System.out.println("Ord Id: " + this.orderId); 

        System.out.println("Cust Id: " + this.custId); 

    } 

} 