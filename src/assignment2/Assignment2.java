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
  
public class Assignment2 { 

    public static void main(String[] args) { 

        // TODO code application logic here 

        Customer[] custList = new Customer[20]; 

        Order[] orderList = new Order[20]; 

        Scanner input = new Scanner(System.in); 

        String n,t; 

         

        //Create new customer 

        custList[0] = new Customer("James", "012-44444444"); 

        custList[1] = new Customer("Willy", "010-55555555"); 

        custList[2] = new Customer("Wolly", "019-99999999"); 

         

        //Create order 

        orderList[0] = new Order("20/07/2021", 1, 85.25); 

        orderList[1] = new Order("21/07/2021", 2, 26.40); 

        orderList[2] = new Order("24/07/2021", 1, 45.60); 

        orderList[3] = new Order("23/07/2021", 2, 27.90); 

        orderList[4] = new Order("26/07/2021", 1, 35.60); 

         

        System.out.println("===================="); 

        orderList[0].ordInfo(); 

        for (int i=0; i<custList.length; i++) { 

            if (orderList[0].getOid()==custList[i].getId()) { 

                custList[i].printCustInfo(); 

                break; 

            } 

        } 

        System.out.println("===================="); 

        System.out.println("Customer 1's orders"); //cid = 1 

        for (int i=0; i<custList.length; i++) { 

            if (custList[i].getId()==1) { 

                custList[i].printCustInfo(); 

                break; 

            } 

        } 

        System.out.println(">>>>>>>>>>>>>>"); 

        for (int i=0; i<Order.ordCount; i++) { 

            if (orderList[i].getCid()==1) { 

                orderList[i].ordInfo(); 

                System.out.println("----------"); 

            } 

         

        }

    } 

     

} 

 
