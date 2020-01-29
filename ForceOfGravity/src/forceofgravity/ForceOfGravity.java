/*
 * Author: Riley Thompson
 * Date: 2/4/2020
 * Course: COMP243
 * Assignment:  Assignment3
 *              ForceOfGravity.java
 * Description: This program will receive inputs for the mass of two objects and
 *              the distance between them. The program will then calculate the 
 *              force of gravity between the two objects if the inputs are valid.              
 */
package forceofgravity;

import javax.swing.JOptionPane;

public class ForceOfGravity 
{
    public static void main(String[] args) 
    {
         //declare variables
        double mass1, mass2, distance, gravity;
        final double GRAVITY = 0.0000000000667;
        
         //input variables
        mass1 = Double.parseDouble(JOptionPane.showInputDialog("Enter mass of "
                + "first object in kg: "));
        mass2 = Double.parseDouble(JOptionPane.showInputDialog("Enter mass of "
                + "second object in kg: "));
        distance = Double.parseDouble(JOptionPane.showInputDialog("Enter "
                + "distance between objects in meters: "));
        
         // run if-else
        if(mass1 <= 0 || mass2 <= 0 || distance <= 0)
        {
            JOptionPane.showMessageDialog(null, "Mass one (kg): " + mass1 + "\n"
                    + "Mass Two (kg): " + mass2 + "\nDistance (m): " + distance +
                    "\n\n Invalid Input. The values should be greater than zero.",
                    "ERROR", JOptionPane.INFORMATION_MESSAGE);
        }
        else
        {
            gravity = (GRAVITY * mass1 * mass2)/(distance * distance);
            JOptionPane.showMessageDialog(null, "Mass one (kg): " + mass1 + "\n"
                    + "Mass Two (kg): " + mass2 + "\nDistance (m): " + distance +
                    "\n\n The force of gravity between the two objects is " +
                    gravity + " Newtons.", "Answer", JOptionPane.INFORMATION_MESSAGE);
        }
        
         // exit
        System.exit(0);
        
    } // end main
    
} // end class
