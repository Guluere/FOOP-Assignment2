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
class Payment { //keeps information of payment has getter setter    //only collects card information 

    private double amount;
    private String trans_type,issuing_bank,card_num;
  

    

    public Payment() {

    }

    public Payment(double amount, String trans_type) {
        this.amount = amount;
        this.trans_type = trans_type;
        
    }
    
    public double getAmount() {
        return amount;
    }

    public String getTrans() {
        return trans_type;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setTrans_type(String trans_type) {
        this.trans_type = trans_type;
    }

    public String getCard_num() {
        return card_num;
    }

    public String getIssuing_bank() {
        return issuing_bank;
    }

    public void setCard_num(String card_num) {
        this.card_num = card_num;
    }

    public void setIssuing_bank(String issuing_bank) {
        this.issuing_bank = issuing_bank;
    }
    public void creditCard(String card_num,String issuing_bank ){
       
        System.out.println("Transaction carried out using Credit Card");
        
    }
     public void debitCard(String card_num,String issuing_bank ){
         
        System.out.println("Transaction carried out using debit Card");
        
    }
    
}
