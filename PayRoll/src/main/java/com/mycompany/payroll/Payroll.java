/*
 *Author: Riley
 *Date: 1/14/2020
 *Program: Payroll.java
 *Description: Input first name, last name,
                hours worked, and base wage.
                Calculate weekly pay and print the report.
 */
package com.mycompany.payroll;

import java.util.Scanner;

public class Payroll {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        /*
        make connection from program to keyboard
        Does not have to be named keyboard, but it is a meaningful name
        System.in is the std. input device
        */
        //declare variables
        String firstName, lastName;
        // A string does not reserve a certain number of bytes
        // instead it reserves an address in memory
        //java has autmatic garbage collector
        //it is a hidden thread that removes garbage when a string variable changes.
        double hoursWorked, baseWage, weeklyPay;
        final int NORMAL_HOURS = 40;
        final double OVERTIME_PAY = 1.5;
        
        //input data
        System.out.println("Enter first name: ");
        firstName = keyboard.next();
        
        //keyboard.next
        System.out.println("Enter last name: ");
        lastName = keyboard.next();  //String stops ata new line or a blank space
        
        System.out.println("Enter hours worked: ");
        hoursWorked = keyboard.nextDouble();  //double
        
        System.out.println("Enters base wage: ");
        baseWage = keyboard.nextDouble();
        
        if(hoursWorked <= 0||baseWage <= 0) //okay to use 0 or constant
        {
            System.out.println("\nError");
        }
        else
        {
            if(hoursWorked <= NORMAL_HOURS)
            {
            //calculate without overtime
                weeklyPay = hoursWorked*baseWage;
            }
            else
            {
            //calculate for overtime 
                weeklyPay = (NORMAL_HOURS * baseWage) + ((hoursWorked-NORMAL_HOURS)*
                        baseWage*OVERTIME_PAY);
            }
            //print report
            System.out.println("\n" + firstName + " " +lastName + "\n" +
                                "Weekly Payroll Report: \n" +
                                "Hours Worked: " + hoursWorked + "\n" +
                                "Base Wage: $" + baseWage +"\n" +
                                "Before Tax: $" + weeklyPay);
            
        }
        
    }//end main
    
}// end class
