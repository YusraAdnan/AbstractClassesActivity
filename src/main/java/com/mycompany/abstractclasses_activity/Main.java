package com.mycompany.abstractclasses_activity;

import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter type of employee (full/part): ");
        String type = scan.nextLine();

        System.out.print("Enter name: ");
        String name = scan.nextLine();

        System.out.print("Enter base salary: ");
        double baseSalary = scan.nextDouble();

        /* We initialize the two types of objects that can be created. 
        We only populate the relevant objects only when we know which object needs to be populated */
        
        FullTimeEmployee fl;
        PartTimeEmployee pl;
        
        Employee emp;
        
        if (type.equalsIgnoreCase("full")) 
        {
           System.out.print("Enter bonus: ");
           double bonus = scan.nextDouble();
           scan.nextLine();
           fl = new FullTimeEmployee(name, baseSalary, bonus);
           fl.printDetails();
           System.out.println("Total Pay: R" + fl.calculatePay());
           
          // emp = new FullTimeEmployee(name, baseSalary, bonus);
           
        } 
        else 
        {
            System.out.print("Enter hours worked: ");
            int hours = scan.nextInt();
            scan.nextLine();
            System.out.print("Enter hourly rate: ");
            double rate = scan.nextDouble();
            scan.nextLine();
            pl = new PartTimeEmployee(name, baseSalary, hours, rate);
            pl.printDetails();
           System.out.println("Total Pay: R" + pl.calculatePay());   
           //emp = new PartTimeEmployee(name, baseSalary, hours, rate);
        }
      //  emp.printDetails();
       // System.out.println("Total Pay: R" + emp.calculatePay());    
    }
}
