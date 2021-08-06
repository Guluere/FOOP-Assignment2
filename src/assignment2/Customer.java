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

    private int custID;
    private String custName = "abc", custIC, custAdd, delivery,returnProd;

    public Customer() {
        
    }

    public Customer(int custID, String custName,String delivery,String returnProd, String custIC, String custAdd) {
        this.custID = custID;
        this.custName = custName;
        this.delivery=delivery;
        this.returnProd=returnProd;
        this.custIC = custIC;
        this.custAdd = custAdd;
    }

    public int getCustID() {
        return this.custID;
    }

    public String getCustName() {
        return this.custName;
    }

    public String getCustIC() {
        return this.custIC;
    }

    public String getCustAdd() {
        return this.custAdd;
    }
     public String getDelivery() {
        return this.delivery;
    }
      public String getReturnProd() {
        return this.returnProd;
    }
   
    
    public void setCustID(int custID){
        this.custID = custID;
    }
    
    public void setCustName(String custName){
        this.custName = custName;
    }
    
    public void setCustIC(String custIC){
        this.custIC = custIC;
    }
    
    public void setCustAdd(String custAdd){
        this.custAdd = custAdd;
    }
     public String setDelivery(String delivery) {
        return this.delivery;
    }
      public String setReturnProd(String returnProd) {
        return this.returnProd;
    }

     

} 