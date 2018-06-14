/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.camp.servlet.BlackJack1;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author guest1Day
 */
public class Dealer extends Human {
    
    protected ArrayList<Integer>cards=new ArrayList<>();
    
    Dealer(){
        
       int num1=1;
        
       for(int i=1;i<=13;i++){
           
           if(num1>10){
             num1=10;  
           } 
           int num=0;
           
           while(num<4){
               this.cards.add(num1);
               num++;
           }
           num1++;
        }
       Collections.shuffle(cards);
    }
    
    public ArrayList<Integer> deal(){
        
        ArrayList<Integer>takeCard=new ArrayList<>();
        
        for(int i=0;i<=1;i++){
            
        int s = this.cards.size()-1;
            
        int r = new java.util.Random().nextInt(s);
        
        takeCard.add(this.cards.get(r));
        
        this.cards.remove(r);
        }
        return takeCard;
        
    }
    
    public ArrayList<Integer>hit(){
        
        ArrayList<Integer>takeCard=new ArrayList<>();
            
        int s = this.cards.size()-1;
            
        int r = new java.util.Random().nextInt(s);
        
        takeCard.add(this.cards.get(r));
        
        this.cards.remove(r);
        
        return takeCard;
    }
    
    @Override
    public int open() {
        
        int total = 0;
        
        int size = this.myCards.size()-1;
        
        for(int i=0;i<=size;i++){
            
            total+=this.myCards.get(i);
        }
        
        return total;
        
        
    }

    @Override
    public void setCard(ArrayList takeCard) {
        
        this.myCards.addAll(takeCard);
        
    }

    @Override
    public boolean checkSum() {
        
        boolean result = true;
        
        int total = 0;
        
        int size = this.myCards.size()-1;
        
        for(int i=0;i<=size;i++){
            
            total+=this.myCards.get(i);
        }
        
        if(total< 17){
            result = true;
        }
        else if(total >= 17){
            result = false;      
        }
        return result;
        
    }
    
}
