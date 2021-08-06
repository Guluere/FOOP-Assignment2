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
class Seller {//keeps information of seller/ supplier  has getter setter

    private int sellerID;
    private String sellerName = "abc", sellerAdd;

    public Seller() {
        
    }

    public Seller(int sellerID, String sellerName,  String sellerAdd) {
        this.sellerID = sellerID;
        this.sellerName = sellerName;
        this.sellerAdd = sellerAdd;
    }

    public int getsellerID() {
        return this.sellerID;
    }

    public String getsellerName() {
        return this.sellerName;
    }

    
    public String getsellerAdd() {
        return this.sellerAdd;
    }
     
    
    public void setsellerID(int sellerID){
        this.sellerID = sellerID;
    }
    
    public void setsellerName(String sellerName){
        this.sellerName = sellerName;
    }
    
    
    
    public void setsellerAdd(String sellerAdd){
        this.sellerAdd = sellerAdd;
    }
    
}
