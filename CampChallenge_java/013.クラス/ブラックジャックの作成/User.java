/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.camp.servlet.BlackJack1;

import java.util.ArrayList;

/**
 *
 * @author guest1Day
 */
public class User extends Human {

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
