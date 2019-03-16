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
    private Vehicle vehicle;
//    private Gender gender;
//    private ArrayList<Vehicle> vehiclesList = new ArrayList<Vehicle>();
    
    public Employee(){
        System.out.println("Inside Default Employee Constructor");
        this.id = 0;
        this.name = "";
//        this.gender = Gender.UNKNOWN;
    }
    
    public Employee(int pEmpId, String name){
        System.out.println("Inside Non-Default Employee Constructor");
        this.id = pEmpId;
        this.name = name;
//        this.gender = gender;
    }
    
    public Employee(int pEmpId, String pName, Vehicle pV){
        System.out.println("Inside Non-Default Employee Constructor");
        this.id = pEmpId;
        this.name = pName;
//        this.gender = gender;
        this.vehicle = pV;
    }
    
    public Employee(int pEmpId, String pName, String plate, String color){
        System.out.println("Inside Non-Default Employee Constructor");
        this.id = pEmpId;
        this.name = pName;
        this.vehicle = new Vehicle(plate,color);
//        this.gender = gender;
//        this.vehiclesList.add(new Vehicle(plate,color));
    }
    
    public String getName(){
        return this.name;
    }
    
    public int getID(){
        return this.id;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setID(int id){
        this.id = id;
    }
    
    public void addVehicle(Vehicle pV){
        this.vehicle = pV;
    }
    
    public Vehicle getVehicle(){
        return this.vehicle;
    }
    
    public abstract double calculatePay();
    
    
    @Override
    public String toString(){
        String out = "ID: " + this.getID() + "\n" + "\n" + this.getName() + "\n";

        if(this.vehicle!=null){
            out += "Vehicles\n";
            out += this.vehicle +"\n";
        }else{
        out += "No Vehicles\n";
        }
        return out;
    }
}
