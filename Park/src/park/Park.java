/*
 * Author: Riley Thompson
 * Date: 1/28/2020
 * Course: COMP2243
 * Assignment: Assignment 2 Park.java
 * Description: This program prompts the user to input the number of park goers
                and calculates the parks revenue
 */
package park;
import javax.swing.JOptionPane;
public class Park 
{
    public static void main(String[] args)
    {
        //declare variables
        int adult, children, senior, totalVisitors;
        double revenueAdult, revenueChildren, revenueSenior, revenueTotal;
        final int rate = 20;
        final double gift = 8.99, discount = 0.35;
        
        //input variables
        adult = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of adult visitors: "));
        children = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of children visitors: "));
        senior = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of senior visitors: "));        
        
        revenueSenior = (double) (senior*(rate-(rate*discount))+(gift*senior));
        revenueChildren = (double) (children*gift);
        revenueAdult = (double) ((adult*rate)+(adult*gift));
        totalVisitors = adult + children + senior;
        revenueTotal = revenueSenior + revenueAdult + revenueChildren;
        
        //Generate output message
        JOptionPane.showMessageDialog(null, "Children Visitors: " + children + 
                "\nSenior Citizen Visitors: " + senior + "\nAverage Adult Visitor: " + 
                adult + "\n\nTotal Number of Visitors: " + totalVisitors + "\n\nAdult"
                + " Visitor Revenue: $" + revenueAdult + "\nChildren Visitor Revenue: $" +
                revenueChildren + "\nSenior Citizen Visitor Revenue: $" + revenueSenior + 
                "\n\nTotal Revenue: $" + revenueTotal, "Park Revenue Information:", JOptionPane.INFORMATION_MESSAGE);
        
        //exit
        System.exit(0);
        
    } // end main
} // end class
