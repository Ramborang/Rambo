/*
 * Author: Riley Thompson
 * Date: 1/25/2020
 * Course: COMP243
 * Assignment: Commission.java
 * Description: calculates the commission rate
 */
package commission;

import javax.swing.JOptionPane;

public class Commission 
{
    public static void main(String[] args) 
    {
        // declare variables
        final int TRANS3000 = 3000, TRANS6500 = 6500,
                TRANS40000 = 40000, TRANS100000 = 100000,
                TRANS500000 = 500000;
        int commission;
        double rate, transaction, commissionRate;
        
        // input variables
        transaction = Double.parseDouble(JOptionPane.showInputDialog("Enter transaction amount: $"));
        
        if(transaction <0)
        {
            JOptionPane.showMessageDialog(null, "Transaction amount cannot be "
                    + "less than zero", "Error", JOptionPane.INFORMATION_MESSAGE);
        }
        else
        {    
            if(transaction >= 0 && transaction < TRANS3000)
            {
                commission = 25;
                rate = 0.015;
            }
            else if(transaction >= TRANS3000 && transaction < TRANS6500)
            {
                commission = 50;
                rate = 0.0065;
            }    
            else if(transaction >= TRANS6500 && transaction < TRANS40000)
            {
                commission = 70;
                rate = 0.0030;        
            }
            else if(transaction >= TRANS40000 && transaction < TRANS100000)
            {
                commission = 100;
                rate = 0.0020;
            }
            else if(transaction >= TRANS100000 && transaction < TRANS500000)
            {
                commission = 150;
                rate = 0.0011;
            }
            else
            {
                commission = 250;
                rate = 0.0009;
            }
            //calculate
            commissionRate = commission + (rate*transaction);
            if(commissionRate < 40)
            {
            commissionRate = 40;
            }
            
            // show message dialog
            JOptionPane.showMessageDialog(null, "Amount of commission: $" +
                    commissionRate, "Commission", JOptionPane.INFORMATION_MESSAGE);
    
        }
    System.exit(0);
    }
    
}
