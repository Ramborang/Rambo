/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
// This program uses if-else-if
package com.mycompany.printingservice2;
import javax.swing.JOptionPane;
public class PrintingService2 
{
    public static void main(String[] args)
    {
        // declare variables
        int copies;
        double amount;
        final int TEN = 10, ZERO = 0;
        final double SERVICE_CHARGE = 3.00, FIRST_TEN = 7.99, AFTER_TEN = 7.25;
        
        //input variables
        copies = Integer.parseInt(JOptionPane.showInputDialog("Enter number of " +
               "copies: "));
        
        //calculate
        if(copies <= TEN && copies > ZERO)
        {
            amount = SERVICE_CHARGE + (copies * FIRST_TEN);
            JOptionPane.showMessageDialog(null, "Amount Due: $" + 
                    amount, "Charge", JOptionPane.INFORMATION_MESSAGE);
                       
        }
        else if(copies > TEN)
        {
            amount = SERVICE_CHARGE + (TEN * FIRST_TEN) + ((copies - TEN)*AFTER_TEN);
            JOptionPane.showMessageDialog(null, "Amount Due: $" + 
                    amount, "Charge", JOptionPane.INFORMATION_MESSAGE);
                    
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Invalid Entry", "ERROR",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
