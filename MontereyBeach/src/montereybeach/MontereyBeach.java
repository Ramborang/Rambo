/*
 * Author: Riley Thompson
 * Date: 1/25/2020
 * Course: COMP243
 * Assignment: MontereyBeach.java
 * Description: Calculates rental charge for mopeds
 */
package montereybeach;
import javax.swing.JOptionPane;
public class MontereyBeach 
{
    public static void main(String[] args) 
    {
        // declare variables
        char moped, day;
        double hours, rental_charge;
        final double weekday3HR50 = 15, weekday3HR250 = 25, weekend3HR50 = 30, 
                weekend3HR250 = 35, weekday50 = 2.50, weekday250 = 3.50, weekend50 = 7.50,
                weekend250 = 8.50;
        
        moped = JOptionPane.showInputDialog("Enter moped type:").charAt(0);
        day = JOptionPane.showInputDialog("Enter weekday or weekend:").charAt(4);
        hours = Double.parseDouble(JOptionPane.showInputDialog("Enter number of hours rented:"));
        
        if(moped == '5' && day == 'd')
        {
            if(hours<0)
            {
                JOptionPane.showMessageDialog(null, "Hours cannot be less than zero", "ERROR", JOptionPane.INFORMATION_MESSAGE);
            }
            else if(hours >= 0 && hours < 3)
            {
                rental_charge = weekday3HR50;
                JOptionPane.showMessageDialog(null, "rental charge: $" + rental_charge, "rental charge", JOptionPane.INFORMATION_MESSAGE);
            }
            else
            {
                rental_charge = weekday3HR50 + ((hours-3)*weekday50);
                JOptionPane.showMessageDialog(null, "rental charge: $" + rental_charge, "rental charge", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        else if(moped == '2' && day == 'd')
        {
            if(hours<0)
            {
                JOptionPane.showMessageDialog(null, "Hours cannot be less than zero", "ERROR", JOptionPane.INFORMATION_MESSAGE);
            }
            else if(hours >= 0 && hours < 3)
            {
                rental_charge = weekday3HR250;
                JOptionPane.showMessageDialog(null, "rental charge: $" + rental_charge, "rental charge", JOptionPane.INFORMATION_MESSAGE);
            }
            else
            {
                rental_charge = weekday3HR250 + ((hours-3)*weekday50);
                JOptionPane.showMessageDialog(null, "rental charge: $" + rental_charge, "rental charge", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        else if(moped == '5' && day == 'e')
        {
            if(hours<0)
            {
                JOptionPane.showMessageDialog(null, "Hours cannot be less than zero", "ERROR", JOptionPane.INFORMATION_MESSAGE);
            }
            else if(hours >= 0 && hours < 3)
            {
                rental_charge = weekend3HR50;
                JOptionPane.showMessageDialog(null, "rental charge: $" + rental_charge, "rental charge", JOptionPane.INFORMATION_MESSAGE);
            }
            else
            {
                rental_charge = weekend3HR50 + ((hours-3)*weekday50);
                JOptionPane.showMessageDialog(null, "rental charge: $" + rental_charge, "rental charge", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        else if(moped == '2' && day == 'e')
        {
            if(hours<0)
            {
                JOptionPane.showMessageDialog(null, "Hours cannot be less than zero", "ERROR", JOptionPane.INFORMATION_MESSAGE);
            }
            else if(hours >= 0 && hours < 3)
            {
                rental_charge = weekend3HR250;
                JOptionPane.showMessageDialog(null, "rental charge: $" + rental_charge, "rental charge", JOptionPane.INFORMATION_MESSAGE);
            }
            else
            {
                rental_charge = weekend3HR250 + ((hours-3)*weekday50);
                JOptionPane.showMessageDialog(null, "rental charge: $" + rental_charge, "rental charge", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "entry invalid", "ERROR", JOptionPane.INFORMATION_MESSAGE);
        }
        
        System.exit(0);
        
    } // end main
    
} // end class