/*
 * Author: Riley Thompson
 * Date: 1/28/2020
 * Course: COMP2243
 * Assignment: Assignment 2 HousingComplex.java
 * Description: This program prompts the user to input the number of one-bedroom
                apartment and its monthly rent, and two-bedroom apartment and 
                its monty rent. The program then calculates and outputs the total
                number of the apartments, the percentage of each type, total rent
                of each type, and overall rent of all apartments.
 */
package housingcomplex;
import javax.swing.JOptionPane;
public class HousingComplex 
{
    public static void main(String[] args) 
    {  
        //input variables
        int oneBedroom, twoBedroom, apartmentTotal;
        double rentOneBedroom, rentTwoBedroom, percentageOne, percentageTwo, totalRentOne;
        double totalRentTwo, overallRent;
        final int PERCENTAGE = 100;
        
        oneBedroom = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of one-bedroom apartments: "));
        rentOneBedroom = Double.parseDouble(JOptionPane.showInputDialog("Enter the monthly rent of one-bedroom apartments: $"));
        
        twoBedroom = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of two-bedroom apartments: "));
        rentTwoBedroom = Double.parseDouble(JOptionPane.showInputDialog("Enter the monthly rent of two-bedroom apartments: $"));
        
        //calculate apartment total
        apartmentTotal = oneBedroom + twoBedroom;
        //calculate percentages
        percentageOne = (double) (oneBedroom*PERCENTAGE)/apartmentTotal;
        percentageTwo = (double) (twoBedroom*PERCENTAGE)/apartmentTotal;
        //calculate total rent for one and two bedroom apartments (assuming all are rented out)
        totalRentOne = oneBedroom*rentOneBedroom;
        totalRentTwo = twoBedroom*rentTwoBedroom;
        overallRent = totalRentOne + totalRentTwo;
        
        // Genreate output message
        JOptionPane.showMessageDialog (null, "Total Number of One-Bedroom Apartments: "
                + oneBedroom + "\nTotal Number of Two-Bedroom Apartments: " + twoBedroom + "\n\nTotal Number of Apartments: " + 
                apartmentTotal + "\n\nPercentage of One-Bedroom Apartments: " + percentageOne + "\n Percentage of Two-Bedroom"
                + "Apartment: " + percentageTwo + "\n\nMonthy Rent of One-Bedroom Apartments: $" + rentOneBedroom + "\nMonthly Rent of Two-"
                + "Bedroom Apartment: $" + rentTwoBedroom + "\n\n(Assume all apartments are rent out.)\nTotal Rent of All One-Bedroom Apartments"
                + ": $" + totalRentOne + "\nTotal Rent of All Two-Bedroom Apartments: $" + totalRentTwo + "\n\nOverall Rent of All Apartments: $" + 
                overallRent, "The housing complex information:", JOptionPane.INFORMATION_MESSAGE);
        
        System.exit(0);
                
    } //end main
    
} //end class