package com.mycompany.abstractclasses_activity;

class FullTimeEmployee extends Employee
{
    private double bonus;

    public FullTimeEmployee(String name, double baseSalary, double bonus)
    {
        super(name, baseSalary);
        this.bonus = bonus;
    }

    @Override
    public double calculatePay() 
    {
        return baseSalary + bonus;
    }
    
    @Override
    public void printDetails()
    {       
        System.out.println("----------------------------------------");
        System.out.println("Employee Type: Full Time");
        super.printDetails(); 
    }
}