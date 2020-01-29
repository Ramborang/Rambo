/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//This program uses Nested Selection Structure (imbeded if-else statements)
package com.mycompany.printingservice3;
import javax.swing.JOptionPane;
public class PrintingService3 
{
    public static void main(String[] args)
    {
        // declare variables
        int copies;
        double amount;
        final int TEN = 10, ZERO = 0;
        final double SERVICE_CHARGE = 3.00, FIRST_TEN = 7.99, AFTER_TEN = 7.25;
        String output;
        
        // input variables
        copies = Integer.parseInt(JOptionPane.showInputDialog("Enter number of copies: "));
        
        // calculate
        if(copies <= ZERO)
        {
            JOptionPane.showMessageDialog(null, "copies cannot be less than or equal to"
                    + "0", "ERROR", JOptionPane.INFORMATION_MESSAGE);
        }
        else
        {
            if(copies > ZERO && copies <= TEN)
            {
                amount = SERVICE_CHARGE + (copies * FIRST_TEN);
            }
            else
            {
                amount = SERVICE_CHARGE + (TEN * FIRST_TEN) + ((copies - TEN)*AFTER_TEN);
            }
            output = "Number of copies: " + copies + "\n" +
                    "Cost: $" + String.format("%.2f", amount);
            
            JOptionPane.showMessageDialog(null, output, "Charge", JOptionPane.INFORMATION_MESSAGE);   
        }
        // exit
        
        System.exit(0);
        
    }
}
