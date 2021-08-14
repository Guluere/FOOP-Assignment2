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
import java.util.HashMap;
import java.util.HashSet;
import java.sql.SQLException;  
import java.sql.Statement;  
import java.sql.*;


public class Assignment2 { 
    
    public static void main(String[] args) throws ClassNotFoundException, SQLException { 
        
        Customer c1 = new Customer();
        Product prod1 = new Product();
        Supplier s1 = new Supplier();
        Payment pay1 = new Payment();
        Payment Cred1= new Credit();
        Payment Deb1 =  new Debit();
        
        Scanner input = new Scanner(System.in);
        String custName, custIc, custAddress, prodDelivery = null, prodReturn = null, prodName, orderDate, suppName, suppAddress, query, upSql, update;
        int custId, prodId, prodQuant, orderId, suppId, userChoice1, ProdQuant = 0, calcProd, record;
        double prodPrice;
        
        Class.forName("org.mariadb.jdbc.Driver");
        Connection con;
        con = DriverManager.getConnection("jdbc:mariadb://localhost:3306/toyshop", "root", "");
        
        int option = 0;
        do
        {
            System.out.println("\n=======Welcome to The Toy Shop ========");
            System.out.println("\nWhat Would you like to do:  \n1.Update Stock items   \n2.Add Customer   \n3.Sales record  \n4.Show all");
            option = input.nextInt();
            HashMap hm = new HashMap<>();
            Statement statement = con.createStatement();
            ResultSet rs = null;
            
            switch (option) {
                case 1:
                {
                       System.out.println("What would you like to do?");
                       System.out.println("1 - Add new item");
                       System.out.println("2 - Update current product");
                       userChoice1 = input.nextInt();
                       if(userChoice1 == 1)
                       {
                           System.out.println("\n Enter new product name ");
                           prodName = input.next();
                           prod1.setProdName(prodName);
                           
                           System.out.println("\n Enter id of the product ");
                        prodId = input.nextInt();
                        prod1.setProdId(prodId);

                        System.out.println("\n Enter price of the product ");
                        prodPrice = input.nextDouble();
                        prod1.setProdPrice(prodPrice);

                        System.out.println("\n Enter the suppliers ID ");
                        suppId = input.nextInt();
                        s1.setSuppId(suppId);

                        System.out.println("\n Enter the suppliers company name ");
                        suppName = input.next();
                        s1.setSuppName(suppName);

                        System.out.println("\n Enter the quantity of the product");
                        prodQuant = input.nextInt();
                        prod1.setProdQuant(prodQuant);
                        
                        query = "INSERT INTO product(prodId,prodName,prodPrice,SuppId,suppName,prodQuant)" + "values(?,?,?,?,?,?)";
                        PreparedStatement preparedStmt = con.prepareStatement(query);
                        
                        preparedStmt.setInt(1, prod1.getProdId());
                        preparedStmt.setString(2, prod1.getProdName());
                        preparedStmt.setDouble(3, prod1.getProdPrice());
                        preparedStmt.setInt(4, s1.getSuppId());
                        preparedStmt.setString(5, s1.getSuppName());
                        preparedStmt.setDouble(6, prod1.getProdQuant());
                        preparedStmt.execute();
                       }
                       else
                       {
                       System.out.println("\n Enter product Id: ");
                        prodId = input.nextInt();
                        prod1.setProdId(prodId);

                        System.out.println("\n Please state num of new product quantity ");
                        prodQuant = input.nextInt();
                        prod1.setProdQuant(prodQuant);

                        upSql = "select * from product where prodId = ? "; //this process gets the specific quantity for sepcific id 
                        PreparedStatement pstmt2 = con.prepareStatement(upSql);
                        pstmt2.setInt(1, prod1.getProdId());
                        rs = pstmt2.executeQuery();
                        if (rs.next()) {
                            do {
                                ProdQuant = rs.getInt(6);
                            } while (rs.next());
                        } else {
                            System.out.println("Null");
                        }
                        calcProd = ProdQuant + prod1.getProdQuant();
                        System.out.println("Stock has been updated");
                        System.out.println("Updated stock for product ID " + prod1.getProdId() + " is " + prod1.getProdQuant());
                        update = "update product set prodQuant =? where prodId=?";
                        PreparedStatement pstUP = con.prepareStatement(update);
                        
                        pstUP.setInt(1, prod1.getProdQuant());
                        pstUP.setInt(2, prod1.getProdId());
                        pstUP.executeUpdate();
                        break;
                       }
                }   
                case 2:
                {
                    System.out.println("\n What is the Customer's name? ");
                    input.nextLine();
                    custName = input.nextLine();
                    c1.setName(custName);

                    System.out.println("\n What is the ic number? ");
                    custIc = input.next();
                    c1.setIc(custIc);

                    System.out.println("\n What is the id number? ");
                    custId = input.nextInt();
                    c1.setId(custId);

                    System.out.println("\n What is the customer's address? ");
                    input.nextLine();
                    custAddress = input.nextLine();
                    c1.setAddress(custAddress);

                    System.out.println("This is all the information added: ");
                    System.out.println(c1.getName());
                    System.out.println(c1.getIc());
                    System.out.println(c1.getAddress());

                    query = "insert into customer(Id,Name,Address,Ic)" + "values(?,?,?,?)";
                    PreparedStatement pstmm = con.prepareStatement(query);
                    pstmm.setInt(1, c1.getId());
                    pstmm.setString(2, c1.getName());
                    pstmm.setString(3, c1.getAddress());
                    pstmm.setString(4, c1.getIc());
                    
                    pstmm.execute();
                }
                case 3:
                    System.out.println("Which would you like to track?:");
                    System.out.println("1. Customer");
                    System.out.println("2. Supplier");
                    System.out.println("3. Product");
                    record = input.nextInt();
                    
                    if(record == 1) {
                        System.out.println("Please enter the customer name:");
                        input.nextLine();
                        custName = input.nextLine();
                        if(custName == c1.getName()) {
                            System.out.println("Name:" + c1.getName());
                            System.out.println("ID: " + c1.getId());
                            System.out.println("IC: " + c1.getIc());
                            System.out.println("Address: " + c1.getAddress());
                        } else {
                            System.out.println("There are no record for this name");
                        }
                    }
                        
                    if(record == 2) {
                        System.out.println("Please enter the supplier name:");
                        suppName = input.next();
                        if(suppName == s1.getSuppName()) {
                            System.out.println("ID:" + s1.getSuppId());
                            System.out.println("Name: " + s1.getSuppName());
                            System.out.println("Product purchased:" + prod1.getProdName());
                            System.out.println("Product ID: " + prod1.getProdId());
                            System.out.println("Quantity:" + prod1.getProdQuant());
                            System.out.println("Price:" + prod1.getProdPrice());
                        } else {
                            System.out.println("There are no record for this name");
                        }
                    }
                    if(record == 3) {
                        System.out.println("Please enter the product name:");
                        prodName = input.next();
                        if(prodName == prod1.getProdName()) {
                            System.out.println("Product ID:" + prod1.getProdId());
                            System.out.println("Name:" + prod1.getProdName());
                            System.out.println("Purchased by:" + s1.getSuppName());
                            System.out.println("Quantity:" + prod1.getProdQuant());
                            System.out.println("Price:" + prod1.getProdPrice());
                        } else {
                            System.out.println("There are no record for this name");
                        }
                    }
                    }
                    
            
        }while( option!=5);
        // TODO code application logic here 
        //Create new customer 

         

         

        

    }
    }


 

     

 

 
