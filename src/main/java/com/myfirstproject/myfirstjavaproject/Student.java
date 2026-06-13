/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.myfirstproject.myfirstjavaproject;

/**
 *
 * @author decagon
 */
public class Student extends Person{
    double gpa;
    Student(String first, String last, double gpa){
       super(first, last);
       this.gpa= gpa;
    }
    
}

