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
/* 

* To change this license header, choose License Headers in Project Properties. 

* To change this template file, choose Tools | Templates 

* and open the template in the editor. 

*/ 

public class Customer { 

    private String name; 

    private int cid; 

    private String tel; 

    public static int custCount=0; 

     

    public Customer(String name, String tel) { 

        custCount++; 

        this.name = name; 

        this.cid = custCount; 

        this.tel = tel; 

         

    } 

     

    public String getName() { 

        return this.name; 

    } 

     

    public int getId() { 

        return this.cid; 

    } 

     

    public String getTel() { 

        return this.tel; 

    } 

     

    public void printCustInfo() { 

        System.out.println("Customer info:"); 

        System.out.println("Id: " + this.cid); 

        System.out.println("Name: " + this.name); 

        System.out.println("Tel: " +this.tel); 

    } 

     

} 