/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inc108.classes;

import java.util.ArrayList;

/**
 *
 * @author IvanAranda
 */

public abstract class Employee {
    
    public static int COUNT = 0;
    private int id;
    private String name;
    private Gender gender;
    private ArrayList<Vehicle> vehiclesList = new ArrayList<Vehicle>();
    
    public Employee(){
        System.out.println("Inside Default Employee Constructor");
        this.id = 0;
        this.name = "";
        this.gender = Gender.UNKNOWN;
    }
    
    public Employee(String name, Gender gender){
        System.out.println("Inside Non-Default Employee Constructor");
        this.id = ++Employee.COUNT;
        this.name = name;
        this.gender = gender;
    }
    
    public Employee(String name, Gender gender, Vehicle v){
        System.out.println("Inside Non-Default Employee Constructor");
        this.id = ++Employee.COUNT;
        this.name = name;
        this.gender = gender;
        this.vehiclesList.add(v);
    }
    
    public Employee(String name, Gender gender, String plate, String color){
        System.out.println("Inside Non-Default Employee Constructor");
        this.id = ++Employee.COUNT;
        this.name = name;
        this.gender = gender;
        this.vehiclesList.add(new Vehicle(plate,color));
    }
    
    public String getName(){
        return this.name;
    }
    
    public int getID(){
        return this.id;
    }
    
    public Gender getGender(){
        return this.gender;
    }
    
    public ArrayList<Vehicle> getVehicles(){
        /**
         * My Vehicles method allows for more than one car
         * per employee, you can drive one car one day and another one 
         * another day
         */
        return this.vehiclesList;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setID(int id){
        this.id = id;
    }
    
    public void addVehicle(Vehicle v){
        this.vehiclesList.add(v);
    }
    
    public abstract double calculatePay();
    
    
    @Override
    public String toString(){
        String out = "ID: " + this.getID() + "\n" + "Gender: " + this.getGender() + "\n" + this.getName() + "\n";

        if(this.getVehicles().size()>0){
            out += "Vehicles\n";
            out += "--------\n";
            for(Vehicle v: this.getVehicles()){
                out += v.toString()+"\n";
            }
        }else{
        out += "No Vehicles\n";
        }
        return out;
    }
}
