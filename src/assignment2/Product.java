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
    public Product(int prodId, String prodName, double prodPrice, int prodQuant) {
        this.prodId = prodId;
        this.prodName = prodName;
        
        this.prodPrice = prodPrice;
        this.prodQuant = prodQuant;
    }



    public int getProdId() {
        return this.prodId;
    }

    public String getProdName() {
        return this.prodName;
    }
    
    public double getProdPrice() {
        return this.prodPrice;
    }

    public int getProdQuant() {
        return this.prodQuant;
    }
    
  
    public void setProdId(int prodId){
        this.prodId = prodId;
    }
    
    public void setProdName(String prodName){
        this.prodName = prodName;
    }
    
    

    public void setProdPrice(double prodPrice) {
        this.prodPrice=prodPrice;
    }

    public void setProdQuant(int prodQuant) {
        this.prodQuant=prodQuant;
    }
    
}
