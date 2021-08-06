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

import java.util.Scanner;
import java.sql.Connection;  
import java.sql.DriverManager;  
import java.sql.ResultSet;  
import java.sql.SQLException;  
import java.sql.Statement;  

public class Assignment2 { 
    static void secondChoice(int first)
    {
        Scanner input = new Scanner(System.in); 
        int option;
        System.out.println("Tracking Transaction:");
        System.out.println("1. Purchase");
        System.out.println("2. Delivery");
        System.out.println("3. Return");
        System.out.println("Please choose a task to carry on: ");
        option = input.nextInt();
        switch(option)
        {
            case 1:
            {
                
            }
            break;
            case 2:
            {
                
            }
            break;
            case 3:
            {
                
            }
            break;
            default: System.out.println("Invalid Choice Selected..."); 
        }
    }

    public static void main(String[] args) { 

        // TODO code application logic here 

        Customer[] custList = new Customer[20]; 

        Order[] orderList = new Order[20]; 

        Scanner input = new Scanner(System.in); 

        String n,t;
        int option;
        //Create new customer 

         

         

        }

    } 

     

 

 
