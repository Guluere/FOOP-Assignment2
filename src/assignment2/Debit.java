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
class Debit extends Payment{
    
  
    public Debit(){
        
    }
   
    public void debitCard(String card_num, String issuing_bank){ //displays the card information
        System.out.println("This are the details: ");
        System.out.println("Card Number : "+ card_num + "Issuing Bank: "+issuing_bank);
    }
    
}
