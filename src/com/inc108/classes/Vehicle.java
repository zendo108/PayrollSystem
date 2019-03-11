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
    public static int ID;
    private String make;
    private String model;
    private String color;
    private String plate;
    
    public Vehicle(String make,String model,String color,String plate){
        Vehicle.ID++;
        this.make = make;
        this.model = model;
        this.color = color;
        this.plate = plate;
    }
    
    public Vehicle(String plate, String color){
        Vehicle.ID++;
//        this.make = make;
//        this.model = model;
        this.color = color;
        this.plate = plate;
    }
    
    public void setMake(String make){
        this.make = make;
    };
    
    public void setModel(String model){
        this.model = model;
    };
    
    public void setColor(String color){
        this.color = color;
    };
    
    public void setPlate(String plate){
        this.plate = plate;
    };
    
    public String getMake(){
        return this.make;
    };
    
    public String getModel(){
        return this.model;
    };
    
    public String getColor(){
        return this.color;
    };
    
    public String getPlate(){
        return this.plate;
    };
    
    @Override
    public String toString(){
        return this.getMake()+ "-" + this.getModel()+ "-" + this.getColor()+ "-" + this.getPlate();
    }
}
