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
public class PartTime extends Employee {
    
    double rate;
    double hoursWorked;
    
    public PartTime(int id, String name, double r, double hw, Vehicle v){
        super(id, name, v);
        this.rate = r;
        this.hoursWorked = hw;
    }
    
    public double getRate(){
        
        return rate;
    }
    
    public double gethoursWorked(){
        
        return hoursWorked;
    }
    
    public void setRate(double r){
        this.rate = r;
    }
    
    public void setHoursWorked(double h){
        this.hoursWorked = h;
    }
    
    @Override
    public double calculatePay(){
        
        System.out.println("Part Time Employee");
        return this.hoursWorked * this.rate;
    }
    
    @Override
    public String toString(){
        return super.toString() + "PartTime\n";
    }
}
