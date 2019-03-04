/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inc108.classes;

/**
 *
 * @author IvanAranda
 */
public class FullTime extends Employee {
    
    public FullTime(String name, Gender gender){
        super(name, gender);
    }
    
    @Override
    public String toString(){
        return super.toString() + "FullTime\n";
    }
}
