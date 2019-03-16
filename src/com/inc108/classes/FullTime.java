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
    
    double salary;
    double overtime;
    
    public FullTime(int id, String name, double sal, double hourAndHalf, Vehicle v){
        super(id, name, v);
        this.salary = sal;
        this.overtime = hourAndHalf;
    }
    
    public double getSalary(){
        
        return salary;
    }
    
    public double getOvertime(){
        
        return overtime;
    }
    
    public void setSalary(double s){
        this.salary = s;
    }
    
    public void setOvertime(double o){
        this.overtime = o;
    }
    
    @Override
    public double calculatePay(){
        System.out.println("Full Time Employee");
        return this.salary + this.overtime;
    }
    
    @Override
    public String toString(){
        return super.toString() + "FullTime\n";
    }

}
