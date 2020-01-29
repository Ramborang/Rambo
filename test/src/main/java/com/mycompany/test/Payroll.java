package com.mycompany.test;

public class Payroll
{
    public static void main(String[] args)
    {
        int hours = 40;
        double grossPay, payRate = 25.0;
        
        grossPay = hours * payRate;
        System.out.println("Your gross Pay is $" + grossPay);
    }
}