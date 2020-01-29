/*
 * Author: Riley Thompson
 * Date: 1/25/2020
 * Course: COMP243
 * Assignment: IncomeTax.java
 * Description: Computes and displays the amount of tax due.
 */
package incometax;
import javax.swing.JOptionPane;
public class IncomeTax {

    public static void main(String[] args) {
        // declare variables
        double income, tax;
        final double TAX_750 = 7.50, TAX_3750 = 37.50, TAX_8250 = 82.50,
                TAX_14250 = 142.50, TAX_2300 = 230.00;
        
        //input variables
        income = Double.parseDouble(JOptionPane.showInputDialog("Enter taxable income:"));
        
        if(income <= 0)
        {
            JOptionPane.showMessageDialog(null, "income cannaot be less than zero", "ERROR", JOptionPane.INFORMATION_MESSAGE);
        }
        else
        {
            if(income > 0 && income < 750)
            {
                tax = (0.01 * income);
            }
            else if (income >= 750 && income < 2250)
            {
                tax = TAX_750 + (0.02 * income);
            }
            else if (income >= 2250 && income < 3750)
            {
                tax = TAX_3750 + (income * 0.03);
            }
            else if (income >= 3750 && income < 5250)
            {
                tax = TAX_8250 + (income * 0.04);
            }
            else if (income >= 5250 && income < 7000)
            {
                tax = TAX_14250 + (income * 0.05);
            }
            else
            {
                tax = TAX_2300 + (income * 0.06);
            }
             // display message
            JOptionPane.showMessageDialog(null, "The amount of tax due is: $" + tax,
                "Tax Due", JOptionPane.INFORMATION_MESSAGE);           
        }
        
        System.exit(0);
        
    }// end main
    
}// end class
