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
class Supplier {//keeps information of seller/ supplier  has getter setter

    private int suppId;
    private String suppName = "abc", suppAddress;

    public Supplier() {
        
    }

    public Supplier(int suppId, String suppName,  String suppAddress) {
        this.suppId = suppId;
        this.suppName = suppName;
        this.suppAddress = suppAddress;
    }

    public int getSuppId() {
        return this.suppId;
    }

    public String getSuppName() {
        return this.suppName;
    }

    
    public String getSuppAddress() {
        return this.suppAddress;
    }
     
    
    public void setSuppId(int suppId){
        this.suppId = suppId;
    }
    
    public void setSuppName(String suppName){
        this.suppName = suppName;
    }
    
    
    
    public void setSuppAdd(String suppAddress){
        this.suppAddress = suppAddress;
    }
    
}
