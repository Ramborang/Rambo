/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.quardraticformula2;
import javax.swing.JOptionPane;
public class QuadraticFormula2 
{
    public static void main(String[] args)
    {
        //declare variables
        int a, b, c;
        double answerOne, answerTwo, discriminant;
        final int FOUR = 4, TWO = 2;
        
        //input variables
        a = Integer.parseInt(JOptionPane.showInputDialog("Enter a: "));
        b = Integer.parseInt(JOptionPane.showInputDialog("Enter b: "));
        c = Integer.parseInt(JOptionPane.showInputDialog("Enter c: "));
        
        // calculate
        discriminant = (b*b) - (FOUR*a*c);
        if(a == 0)
        {
            JOptionPane.showMessageDialog(null, "a cannot equal zero", "Invalid Entry",
                    JOptionPane.INFORMATION_MESSAGE);
        }
        else if(discriminant < 0)
        {
            JOptionPane.showMessageDialog(null, "disciminant cannot be less than zero", 
                    "Error", JOptionPane.INFORMATION_MESSAGE);
        }
        else if(discriminant == 0)
        {
            answerOne = (-b + Math.sqrt(discriminant))/(TWO*a);
            JOptionPane.showMessageDialog(null, "Answer: " + answerOne, "Congratulations,", 
                    JOptionPane.INFORMATION_MESSAGE);
        }
        else
        {
            answerOne = (-b + Math.sqrt(discriminant))/(TWO*a);
            answerTwo = (-b - Math.sqrt(discriminant))/(TWO*a);
            JOptionPane.showMessageDialog(null, "Answer one: " + String.format("%.2f", answerOne) 
                    + "\n" + "Answer two: " + String.format("%.2f", answerTwo), 
                    "Congratulations", JOptionPane.INFORMATION_MESSAGE);
        }
        
        System.exit(0);
        
    }
}
