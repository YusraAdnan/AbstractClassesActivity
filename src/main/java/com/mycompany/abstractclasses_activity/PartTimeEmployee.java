package com.mycompany.abstractclasses_activity;

class PartTimeEmployee extends Employee
{
    private int hoursWorked;
    private double hourlyRate;

    public PartTimeEmployee(String name, double baseSalary, int hoursWorked, double hourlyRate) {
        super(name, baseSalary);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculatePay() 
    {
        return baseSalary + (hoursWorked * hourlyRate);
    }
    
     @Override
    public void printDetails()
    {
        System.out.println("----------------------------------------");
        System.out.println("Employee Type: Part Time");
        super.printDetails(); 
    }
}