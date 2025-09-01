/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.abstractclasses_activity;
public abstract class Employee 
{
    protected String name;
    protected double baseSalary;

    public Employee(String name, double baseSalary) 
    {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public abstract double calculatePay();

    public void printDetails() 
    {
        System.out.println("Employee: " + name);
        System.out.println("Base Salary: R" + baseSalary);
    }
}
