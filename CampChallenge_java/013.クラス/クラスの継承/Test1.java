/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.camp.servlet;

/**
 *
 * @author guest1Day
 */
public class Test1 {
    
    public static void main(String[]args){
        
        Student taro = new Student();
        
        taro.setHuman("太郎",   16);
        
        System.out.println(taro.name);
        System.out.println(taro.age);
        
        taro.reset();
        
        System.out.println(taro.name);
        System.out.println(taro.age);
    }
    
}
