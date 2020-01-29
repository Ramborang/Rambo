/*
 * Author: Riley Thompson
 * Date: 1/25/2020
 * Course: COMP243
 * Assignment: Calculator.java
 * Description: This program mimics a calculator
 */
package calculator;

import javax.swing.JOptionPane;

public class Calculator {

    public static void main(String[] args) {
        double number1, number2, finalNumber;
        char operation;
        
        number1 = Double.parseDouble(JOptionPane.showInputDialog("Enter a number: "));
        operation = JOptionPane.showInputDialog("Enter operator (+, -, *, /): ").charAt(0);
        number2 = Double.parseDouble(JOptionPane.showInputDialog("Enter a second number: "));
              
        if(operation == '+')
        {
            finalNumber = number1 + number2;
            JOptionPane.showMessageDialog(null, "Result: " + finalNumber, "Calculation", JOptionPane.INFORMATION_MESSAGE);
        }
        else if(operation == '-')
        {
            finalNumber = number1 - number2;
            JOptionPane.showMessageDialog(null, "Result: " + finalNumber, "Calculation", JOptionPane.INFORMATION_MESSAGE);
        }
        else if(operation == '*')
        {
            finalNumber = number1 * number2;
            JOptionPane.showMessageDialog(null, "Result: " + finalNumber, "Calculation", JOptionPane.INFORMATION_MESSAGE);
        }
        else if(operation == '/')
        {
            if(number2 == 0)
            {
                JOptionPane.showMessageDialog(null, "Cannot divid by zero", "ERROR", 
                        JOptionPane.INFORMATION_MESSAGE);                
            }
            else
            {
            finalNumber = number1/number2;
            JOptionPane.showMessageDialog(null, "Result: " + finalNumber, "Calculation", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Invalid operator: " + operation, "ERROR", JOptionPane.INFORMATION_MESSAGE);
        }
        
        System.exit(0);
        
    } // end main
    
} // end class
