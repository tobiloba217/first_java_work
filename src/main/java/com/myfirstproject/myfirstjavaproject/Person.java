/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.myfirstproject.myfirstjavaproject;

/**
 *
 * @author decagon
 */
public class Person {
    String first;
    String last;
    
    Person(String first, String last){
        this.first = first;
        this.last = last;
    }
   void showName(){
   System.out.println("hello " +this.first + " " + this.last);
   }
}
