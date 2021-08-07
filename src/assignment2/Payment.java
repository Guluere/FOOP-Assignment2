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
    private String transType,issueBank,cardNum;
  

    

    public Payment() {

    }

    public Payment(double amount, String transType) {
        this.amount = amount;
        this.transType = transType;
        
    }
    
    public double getAmount() {
        return amount;
    }

    public String getTrans() {
        return transType;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setTransType(String transType) {
        this.transType = transType;
    }

    public String getCardNum() {
        return cardNum;
    }

    public String getIssueBank() {
        return issueBank;
    }

    public void setCardNum(String cardNum) {
        this.cardNum = cardNum;
    }

    public void setIssueBank(String issueBank) {
        this.issueBank = issueBank;
    }
    public void creditCard(String cardNum,String issueBank ){
       
        System.out.println("Transaction carried out using Credit Card");
        
    }
     public void debitCard(String cardNum,String issueBank ){
         
        System.out.println("Transaction carried out using debit Card");
        
    }
    
}
