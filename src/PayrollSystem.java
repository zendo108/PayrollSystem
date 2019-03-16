/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import com.inc108.classes.*;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author IvanAranda
 */
public class PayrollSystem {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Employee> arrEmp = new ArrayList<Employee>();
        

//        employeeList.add(readNewFulltime());
//        employeeList.add(readNewParttime());
        
        String varCont = "N";
        byte menuOption = 0;
        do{
            menuOption = showMenu();
            switch(menuOption){
                case 1:
                    FullTime ft;
                    ft = readNewFullTime();
                    addEmployee(arrEmp, ft);
                    break;
                case 2:
                    PartTime pt;
                    pt = readNewPartTime();
                    addEmployee(arrEmp, pt);
                    break;
                case 3:
                    calcPayroll(arrEmp);
                    break;
                default:
                    break;
            }
        }
        while(menuOption != 4);

        
        
    }
    
    public static FullTime readNewFullTime(){
        
        int id=0;
        String name = null;
        double sal = 0.0;
        double hourAndHalf = 0.0;//overtime
        Scanner kbd = new Scanner(System.in);
        System.out.print("Enter ID: "); id = kbd.nextInt();
        System.out.print("\nEnter Name: "); name = kbd.next();
        System.out.print("\nEnter Salary: "); sal = kbd.nextDouble();
        System.out.print("\nEnter Bonus: "); hourAndHalf = kbd.nextDouble();
        FullTime ft1 = null;
        ft1 = new FullTime(id,name, sal, hourAndHalf, getVehicle());
        return ft1;
       
    }
    
    public static PartTime readNewPartTime(){
        int id=0;
        String name = null;
        double rate = 0.0;
        double hoursWorked = 0.0;//overtime
        Scanner kbd = new Scanner(System.in);
        System.out.print("Enter ID: "); id = kbd.nextInt();
        System.out.print("\nEnter Name: "); name = kbd.next();
        System.out.print("\nEnter Salary: "); rate = kbd.nextDouble();
        System.out.print("\nEnter Bonus: "); hoursWorked = kbd.nextDouble();
        PartTime pt1 = null;
        pt1 = new PartTime(id, name, rate, hoursWorked, getVehicle());
        return pt1;
       
    }
    
    public static void addEmployee(ArrayList<Employee> pArrEmp, Employee pEmp){
        /**
         * this methods adds one employee to the employee array
         */
        
        pArrEmp.add(pEmp);
    }
    
    public static void calcPayroll(ArrayList<Employee> pArrEmp){
        double totalCompanyPay = 0.0;
        double individualPay;
        
        //calculate salary - manipulate array only
        for(int i=0; i<pArrEmp.size();i++){
            System.out.println("\n**************************************\n");
            individualPay = (pArrEmp.get(i)).calculatePay();
            Vehicle v = (pArrEmp.get(i)).getVehicle();
            String hasVehicle;
            
            //check if employee has vehicle
            if(v == null)
                hasVehicle = "No";
            else
                hasVehicle = "Yes";
            
            System.out.println("Employee Name: " + (pArrEmp.get(i)).getName());
            System.out.println("Has Vehicle: " + hasVehicle);
                
            if(v != null){
                System.out.println("Plate Number: " + v.getPlate());
                System.out.println("Vehicle Color: " + v.getColor());
            }
            
            System.out.println("Take Home Pay: " + individualPay);
            totalCompanyPay = totalCompanyPay + individualPay;
        }
        System.out.println("/***************************\nTotal Payroll of the Company: " + totalCompanyPay + "\n***************************");
    }
    
    public static byte showMenu(){
        byte menuOption = 0;
        Scanner kbd = new Scanner(System.in);
        
        System.out.println(""
                + "/****************************************************/"
                + "\n/* 1. Add FullTime                                  */"
                + "\n/* 2. Add PartTime                                  */"
                + "\n/* 3. Calculate Payroll                             */"
                + "\n/* 4. Exit                                          */"
                + "\n/****************************************************/");
        System.out.print("Input: "); menuOption = kbd.nextByte();
        return menuOption;
    
    }
    
    public static Vehicle getVehicle(){
        /**
         * Creates and returns a vehicle
         */
        Scanner kbd = new Scanner(System.in);
        String hasVehicle = "N";
        System.out.print("\nDoes this employee have a vehicle(Y/N): "); hasVehicle = kbd.next();
        
        if(hasVehicle.equalsIgnoreCase("Y")){
            System.out.print("\nEnter Plate Number: "); String auxPlate = kbd.next();
            System.out.print("\nEnter Vehicle Color: "); String auxColor = kbd.next();
            return (new Vehicle(auxPlate, auxColor));
        }else{
            return null;
        }
    
    }
}
