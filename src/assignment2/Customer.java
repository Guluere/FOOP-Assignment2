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

class Customer {//keeps information of customer has getter setter

    private int Id;
    private String Name = "abc", Ic, Address, prodDelivery,prodReturn;

    public Customer() {
        
    }

    public Customer(int Id, String Name,String prodDelivery,String prodReturn, String Ic, String Address) {
        this.Id = Id;
        this.Name = Name;
        this.Ic = Ic;
        this.Address = Address;
        this.prodDelivery = prodDelivery;
        this.prodReturn = prodReturn;
 
    }

    public int getId() {
        return this.Id;
    }

    public String getName() {
        return this.Name;
    }

    public String getIc() {
        return this.Ic;
    }

    public String getAddress() {
        return this.Address;
    }
     public String getProdDelivery() {
        return this.prodDelivery;
    }
      public String getProdReturn() {
        return this.prodReturn;
    }
   
    
    public void setId(int Id){
        this.Id = Id;
    }
    
    public void setName(String Name){
        this.Name = Name;
    }
    
    public void setIc(String Ic){
        this.Ic = Ic;
    }
    
    public void setAddress(String Address){
        this.Address = Address;
    }
     public String setProdDelivery(String prodDelivery) {
        return this.prodDelivery;
    }
      public String setProdReturn(String prodReturn) {
        return this.prodReturn;
    }

     

} 