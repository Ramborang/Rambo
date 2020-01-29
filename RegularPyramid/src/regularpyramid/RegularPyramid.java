/*
 * Author: Riley Thompson
 * Date: 2/4/2020
 * Course: COMP243
 * Assignment:  Assignment3
 *              RegularPyramid.java
 * Description: This program will receive inputs for the base and  the height
 *              of a regular pyramid and output the volume, lateral surface area,
 *              base area, and total surface area.               
 */
package regularpyramid;

import javax.swing.JOptionPane;

public class RegularPyramid 
{

    public static void main(String[] args) 
    {
         // declare variables
        double base, height, slant, volume,
                lateralSurface, baseSurface, totalSurface;
        final int VOLUME_CONSTANT = 3, LATERAL_CONSTANT = 4;
        final double TRIANGLE_CONSTANT = 0.5;
        
         // input variables
        base = Double.parseDouble(JOptionPane.showInputDialog("Enter the base: "));
        height = Double.parseDouble(JOptionPane.showInputDialog("Enter the height: "));
        
        if(base <= 0 || height <= 0)
        {
            JOptionPane.showMessageDialog(null, "Base: " + String.format("%.2f", base) + "\n"
                    + "Height: " + String.format("%.2f", height) + "\n\nInvalid Input! Both base and height"
                    + " must be greater than zero.", "ERROr", JOptionPane.INFORMATION_MESSAGE);
        }
        else
        {
             // calculate
            slant = Math.sqrt((TRIANGLE_CONSTANT * TRIANGLE_CONSTANT * base * base) + (height * height));
            
            volume = (base * base * height)/VOLUME_CONSTANT;
            
            lateralSurface = LATERAL_CONSTANT*(TRIANGLE_CONSTANT * base * slant);
            baseSurface = base * base;
            totalSurface = baseSurface + lateralSurface;
            
             // output message
            JOptionPane.showMessageDialog(null, "Base: " + String.format("%.2f", base) + 
                    "\nHeight: " + String.format("%.2f", height) + "\n******************\n\nSlant Height"
                    + ": " + String.format("%.2f", slant) + "\nVolume: " + String.format("%.2f", volume) +
                    "\nBase Surface Area: " + String.format("%.2f", baseSurface) + "\nLateral Surface"
                    + "Area: " + String.format("%.2f", lateralSurface) + "\nTotal Surface Area: " + 
                    String.format("%.2f", totalSurface), "Regular Triangle Information", JOptionPane.INFORMATION_MESSAGE);
        }
        
         // exit
        System.exit (0);
        
    } // end main   
    
} // end class
