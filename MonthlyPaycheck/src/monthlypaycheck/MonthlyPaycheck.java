/*
 * Author: Riley Thompson
 * Date: 1/25/2020
 * Course: COMP243
 * Assignment: MonthlyPaycheck.java
 * Description: calculates the monthly paycheck of
                a salesperson at a local department store.
 */
package monthlypaycheck;
import javax.swing.JOptionPane;
public class MonthlyPaycheck 
{
    public static void main(String[] args) 
    {
        // declare variables
        int years;
        double salary, bonus, paycheck, sales, commission, paycheckBonus;
        final int SALES_MIN = 5000, SALES_MAX = 10000, YEARS = 5;
        final double COMMISSION_MIN = 0.03, COMMISSION_MAX = 0.06;
        
        // input variables
        years = Integer.parseInt(JOptionPane.showInputDialog("Enter number of years: "));
        salary = Double.parseDouble(JOptionPane.showInputDialog("Enter current monthly salary: "));
        sales = Double.parseDouble(JOptionPane.showInputDialog("Enter sales revenue: "));
        
        // figure out bonus
        if(years <= YEARS){
            bonus = 10;
            paycheckBonus = (bonus*years);
        }
        else{
            bonus = 20;
            paycheckBonus = (bonus*years);
        }
        
        // figure out sales
        if(sales >= SALES_MAX){
            commission = sales*COMMISSION_MAX;            
        } 
        else if(sales < SALES_MIN){
            commission = 0;
        }
        else{
            commission = sales*COMMISSION_MIN;
        }
        // calculate paycheck
        paycheck = sales + commission + paycheckBonus;
        
        //show message
        JOptionPane.showMessageDialog(null, "Your monthly paycheck is: \n$" + paycheck, 
                "Monthly Paycheck", JOptionPane.INFORMATION_MESSAGE);
   
    } //end main 
    
} //end class
