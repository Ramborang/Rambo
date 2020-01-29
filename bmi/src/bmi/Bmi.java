
package bmi;

import javax.swing.JOptionPane;

public class Bmi
{
    public static void main(String[] args) 
    {
        // variables
        double bmi, weight, height;
        final int CONSTANT = 703, MAX = 25;
        final double MIN = 18.5;
        
        height = Double.parseDouble(JOptionPane.showInputDialog("Enter height in inches: "));
        weight = Double.parseDouble(JOptionPane.showInputDialog("Enter weight in pounds "));
        
        if(height <= 0)
            JOptionPane.showMessageDialog(null, "height cannot be less then or equal"
                    + " to zero", "Error", JOptionPane.INFORMATION_MESSAGE);
        
        else if(weight <= 0)
            JOptionPane.showMessageDialog(null, "weight cannot be less then or equal"
                    + " to zero", "Error", JOptionPane.INFORMATION_MESSAGE);
        
        else 
        {
            bmi = (double) ((weight*CONSTANT)/(height*height));
            if(bmi < MIN)
                JOptionPane.showMessageDialog(null, "You are underweight\nBMI: " + bmi, "BMI", JOptionPane.INFORMATION_MESSAGE);
            else if(bmi > MAX)
                JOptionPane.showMessageDialog(null, "You are overweight\nBMI: " + bmi, "BMI", JOptionPane.INFORMATION_MESSAGE);
            else
                JOptionPane.showMessageDialog(null, "You are optimal\nBMI: " + bmi, "BMI", JOptionPane.INFORMATION_MESSAGE);
        }
                
        System.exit(0);
    } // end main
     
} // end class
