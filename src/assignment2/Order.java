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

    private int oid; 

    private int cid; 

    private double total=0; 

     

    public static int ordCount=0; 

     

    public Order(String date, int cid, double total) { 

        ordCount++; 

        this.date = date; 

        this.oid = ordCount; 

        this.cid = cid; 

        this.total = total;  

    } 

     

    public int getOid() { 

        return this.oid; 

    } 

     

    public int getCid() { 

        return this.cid; 

    } 

     

    public void ordInfo() { 

        System.out.println("Date: " + this.date); 

        System.out.println("Ord Id: " + this.oid); 

        System.out.println("Cust Id: " + this.cid); 

    } 

} 