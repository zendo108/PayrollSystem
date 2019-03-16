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
public class Vehicle {

    private String color;
    private String plate;
    

    public Vehicle(String plate, String color){
        this.color = color;
        this.plate = plate;
    }
    
    public void setColor(String color){
        this.color = color;
    };
    
    public void setPlate(String plate){
        this.plate = plate;
    };
    
    public String getColor(){
        return this.color;
    };
    
    public String getPlate(){
        return this.plate;
    };
    
    @Override
    public String toString(){
        return this.getColor()+ "-" + this.getPlate();
    }
}
