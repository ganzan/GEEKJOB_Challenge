/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.camp.servlet.BlackJack1;

/**
 *
 * @author guest1Day
 */
public class BlackJack {
    
    public static void main(String[]args){
        
        User u = new User();
        
        Dealer d = new Dealer();
        
        u.setCard(d.deal());
        
        d.setCard(d.deal());
        
        System.out.println("カードを配りました。");
        
        
        System.out.println("ユーザーのカードの合計は"+u.open()+"です。");
        
        System.out.println("ディーラーのカードの合計は"+d.open()+"です。");
        
        while(u.checkSum() == true){
        
            u.setCard(d.hit());
            System.out.println("ユーザーはカードを一枚引きました");
            
            if(u.open()<17){
            
                System.out.println("ユーザーのカードの合計は"+u.open()+"です。");
            }
       }
        
        while(d.checkSum() == true){
        
            d.setCard(d.hit());
            System.out.println("ディーラーはカードを一枚引きました");
            
            if(d.open()<17){
                
                System.out.println("ディーラーのカードの合計は"+d.open()+"です。");
            }
            
       }
        
        System.out.println("勝負!");
        System.out.println("ユーザーのカードの合計は"+u.open());
        System.out.println("ディーラーのカードの合計は"+d.open());
        
        if(u.open()>21){
            System.out.print("ユーザーの負けです…");
        }
        else if(u.open()<d.open() && d.open()<=21){
            System.out.print("ユーザーの負けです…");
        }
        else if(u.open() == d.open()){
            System.out.print("引き分けです。");
        }
        else
        {
            System.out.print("ユーザーの勝ちです!");
        }
   }
        
        
        
    
    
}
