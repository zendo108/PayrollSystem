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

public class Employee {
    
    public static int COUNT = 0;
    private int id;
    private String name;
    private Gender gender;
    private ArrayList<Vehicle> vehiclesList = new ArrayList<Vehicle>();
    
    public Employee(String name, Gender gender){
        this.id = ++Employee.COUNT;
        this.name = name;
        this.gender = gender;
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
        return this.vehiclesList;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void addVehicle(Vehicle v){
        this.vehiclesList.add(v);
    }
    
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
