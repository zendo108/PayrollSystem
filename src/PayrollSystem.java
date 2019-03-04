/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import com.inc108.classes.*;
import java.util.ArrayList;
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
        ArrayList<Employee> employeeList = new ArrayList<Employee>();
        
        PartTime ptEmployee1 = new PartTime("Jody Lee Shaws", Gender.FEMALE);
        Vehicle ptEmployee1_car = new Vehicle("Toyota","Tacoma","Red","CL123");
        ptEmployee1.addVehicle(ptEmployee1_car);
        
        FullTime ftEmployee2 = new FullTime("Wisdom Towz", Gender.MALE);
        Vehicle ftEmployee2_car = new Vehicle("Honda","Accord","Blue","23NK23");
        Vehicle ftEmployee2_car2 = new Vehicle("Chevy","Silverado","Black","NSYNK");
        ftEmployee2.addVehicle(ftEmployee2_car);
        ftEmployee2.addVehicle(ftEmployee2_car2);
        
        PartTime ptEmployee2 = new PartTime("Jarjar Bings", Gender.UNKNOWN);
        
        employeeList.add(ptEmployee1);
        employeeList.add(ftEmployee2);
        employeeList.add(ptEmployee2);
        
        for(Employee emp: employeeList){
            System.out.println(emp.toString());
        }
        
    }
    
}
