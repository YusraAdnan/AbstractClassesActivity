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
        scan.nextLine();

        /* We initialize the two types of objects that can be created. 
        We only populate the relevant objects only when we know which object needs to be populated */
        
        FullTimeEmployee ft;
        PartTimeEmployee pt;
        
        
        Employee emp;
        
        if (type.equalsIgnoreCase("full")) 
        {
           System.out.print("Enter bonus: ");
           double bonus = scan.nextDouble();
           scan.nextLine();
          // ft = new FullTimeEmployee(name, baseSalary, bonus);
          // ft.printDetails();
          // System.out.println("Total Pay: R" + ft.calculatePay());
           emp = new FullTimeEmployee(name, baseSalary, bonus);
        } 
        else 
        {
            System.out.print("Enter hours worked: ");
            int hours = scan.nextInt();
            scan.nextLine();
            System.out.print("Enter hourly rate: ");
            double rate = scan.nextDouble();
            scan.nextLine();
           // pt = new PartTimeEmployee(name, baseSalary, hours, rate);
           // pt.printDetails();
           //System.out.println("Total Pay: R" + pt.calculatePay());   
           emp = new PartTimeEmployee(name, baseSalary, hours, rate);
        }
        /* this is dynamic method binding
        - "emp" is a type of employee (Part or Full time)
        - based on which if else block was executed the 'emp' is populated with that object
        Therefore at runtime it decides to call methods either from the Full Time employee or Part time employee*/
        emp.printDetails();
        System.out.println("Total Pay: R" + emp.calculatePay());   

    }
}
