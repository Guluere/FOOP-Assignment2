/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

/**
 *
 * @author user
 */
class Product { //keeps information of product has getter setter 
    private int prodId=0, prodQuant=0;
    private String prodName="";
    private double prodPrice;
   
    public Product(){
        
    }
    public Product(int prodID, String prodName, double prodPrice, int prodQuant) {
        this.prodId = prodID;
        this.prodName = prodName;
        
        this.prodPrice = prodPrice;
        this.prodQuant = prodQuant;
    }



    public int getProdID() {
        return this.prodId;
    }

    public String getProdName() {
        return this.prodName;
    }
    
    public double getProdPrice() {
        return this.prodPrice;
    }

    public int getProdQuan() {
        return this.prodQuant;
    }
    
  
    public void setProdID(int prodID){
        this.prodId = prodID;
    }
    
    public void setProdName(String prodName){
        this.prodName = prodName;
    }
    
    

    public void setProdPrice(double prodPrice) {
        this.prodPrice=prodPrice;
    }

    public void setProdQuan(int prodQuan) {
        this.prodQuant=prodQuan;
    }
    
}
