/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.payrollgui;
/*
 *Author: Riley
 *Date: 1/14/2020
 *Program: Payroll.java
 *Description: Input first name, last name,
                hours worked, and base wage.
                Calculate weekly pay and print the report.
 */
import javax.swing.JOptionPane; //GUI object has two dialog boxes
/*
input dialog boxes (input)
message dialog box (output)
*/
public class PayrollGUI {
    
    public static void main(String[] args){
        
        
        String firstName, lastName, output;
        
        double hoursWorked, baseWage, weeklyPay;
        
        //input data
        
        firstName = JOptionPane.showInputDialog("Enter First Name: ");
        //keyboard.next
        
        lastName = JOptionPane.showInputDialog("Enter Last Name: ");
        
        hoursWorked = Double.parseDouble(JOptionPane.showInputDialog("Enter Hours Worked: "));
        
        baseWage = Double.parseDouble(JOptionPane.showInputDialog("Enter Base Wage: "));
        
        //calculate
        weeklyPay = hoursWorked*baseWage;
        //print report
        output = "\n" + firstName + " " +lastName + "\n" +
                 "Weekly Payroll Report: \n" +
                 "Hours Worked: " + String.format("%.2f", hoursWorked) + "\n" +
                 "Base Wage: $" + String.format("%.2f", baseWage) +"\n" +
                 "Before Tax: $" + String.format("%.2f", weeklyPay);
        
        JOptionPane.showMessageDialog(null, output, "Payroll Program - by Riley Thompson",
                                        JOptionPane.INFORMATION_MESSAGE);       
        //JOptionPane.showMessageDialog(null, output, "Title", JOptionPnae.INFORMATION_MESSAGE)
        //null=parent window (centered on monitor)
        //JOptionPane.INFORMATION_MESSAGE is icon
        System.exit(0);//is not neccesary but makes it a bit faster
        //exit code 0 - successful
    }//end main
    
}// end class

    

