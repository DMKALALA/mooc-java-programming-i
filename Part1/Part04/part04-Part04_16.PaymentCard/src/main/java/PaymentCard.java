/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DENIS
 */
public class PaymentCard {
    private double balance;

    public PaymentCard(double openingBalance) {
        // write code here
        this.balance = openingBalance;
        
    }
   
    public void eatAffordably() {
    // write code here
        if(this.balance -2.60 <0){
            this.balance = this.balance;
        }
        else{
            this.balance-=2.60;
        }
    }

    public void eatHeartily() {
        // write code here
        if(this.balance -4.60 <0){
            this.balance = this.balance;
        }
        else{
            this.balance-=4.60;
        }
    }
    
    public void addMoney(double amount) {
    // write code here
        
        if(amount>0){
            this.balance+=amount;
        }
        if((this.balance + amount >= 150)){
            this.balance = 150;
        }
        
    }
    @Override
    public String toString() {
        // write code here
        return "The card has a balance of " + this.balance + " euros";
    }
}