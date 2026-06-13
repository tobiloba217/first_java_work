/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.myfirstproject.myfirstjavaproject;

/**
 *
 * @author decagon
 */
public class Phone {
    String brand;
    int storageSize;
    
     public Phone(String factoryBrand, int factoryStorage){ 
     brand = factoryBrand;   
     storageSize = factoryStorage;
     }
     
     public void done() {
        System.out.println("The phone is an " + brand + " with " + storageSize);
    }
     
     
     
    
}
