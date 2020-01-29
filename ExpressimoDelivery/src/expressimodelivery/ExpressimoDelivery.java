/*
 * Author: Riley Thompson
 * Date: 1/26/2020
 * Course: COMP243
 * Assignment: MontereyBeach.java
 * Description: Calculates charge for shipping a letter or box
 */
package expressimodelivery;
import javax.swing.JOptionPane;
public class ExpressimoDelivery 
{
    public static void main(String[] args) 
    {
        // declare varibles
        String packageType, deliveryType;
        int weight;
        final int WEIGHT = 16;
        final double PRIORITY_LETTER = 12.00, STANDARD_LETTER = 10.50, BOX_PRIORITY = 15.75, BOX_STANDARD = 13.75,
                BOX_TWODAY = 7.00, BOX_PRIORITYLB = 1.25, BOX_STANDARDLB = 1.00, BOX_TWODAYLB = 0.50, LETTER_MAX = 0.5;
        double charge;
        
        // input variables
        packageType = JOptionPane.showInputDialog("Enter package type (Letter or Box):");
        deliveryType = JOptionPane.showInputDialog("Enter type of service (Next Day Priority, Next "
                + "Day Standard, or 2-Day):");
        weight = Integer.parseInt(JOptionPane.showInputDialog("Enter weight of package in punds:"));
        
        // run
        switch (packageType) 
        {
            case "Letter":
        switch (deliveryType) 
        {
            case "Next Day Priority":
                if(weight >= LETTER_MAX)
                {
                    JOptionPane.showMessageDialog(null, "weight cannot exceed 8 ounces", "Letter is too Heavy", JOptionPane.INFORMATION_MESSAGE);
                }
                else if(weight < 0)
                {
                    JOptionPane.showMessageDialog(null, "weight cannot be less than zero", "ERROR", JOptionPane.INFORMATION_MESSAGE);
                }
                else
                {
                    charge = PRIORITY_LETTER;
                    JOptionPane.showMessageDialog(null, "Charge: $" + charge, "you owe", JOptionPane.INFORMATION_MESSAGE);
                }
                break;
            case "Next Day Standard":
                if(weight >= LETTER_MAX)
                    {
                        JOptionPane.showMessageDialog(null, "weight cannot exceed 8 ounces", "Letter is too Heavy", JOptionPane.INFORMATION_MESSAGE);
                    }
                else if(weight < 0)
                {
                    JOptionPane.showMessageDialog(null, "weight cannot be less than zero", "ERROR", JOptionPane.INFORMATION_MESSAGE);
                }
                else
                {
                    charge = STANDARD_LETTER;
                    JOptionPane.showMessageDialog(null, "Charge: $" + charge, "you owe", JOptionPane.INFORMATION_MESSAGE);
                }
                break;
            case "2-Day":
                JOptionPane.showMessageDialog(null, "2-Day delivery is not available for letters", "I'm sorry", JOptionPane.INFORMATION_MESSAGE);
                break;
            default:
                JOptionPane.showMessageDialog(null, "invalid delivery type", "error", JOptionPane.INFORMATION_MESSAGE);
                break;
        }
        break;
            case "Box":
        switch (deliveryType) {
            case "Next Day Priority":
                if(weight >= WEIGHT)
                {
                    charge = BOX_PRIORITY + (Math.ceil(weight/WEIGHT)*(BOX_PRIORITYLB));
                    JOptionPane.showMessageDialog(null, "Charge: $" + charge, "you owe", JOptionPane.INFORMATION_MESSAGE);
                }
                else if(weight < 0)
                {
                    JOptionPane.showMessageDialog(null, "weight cannot be less than zero", "ERROR", JOptionPane.INFORMATION_MESSAGE);
                }
                else if(weight >= 0 && weight < WEIGHT)
                {
                    charge = BOX_PRIORITY;
                    JOptionPane.showMessageDialog(null, "Charge: $" + charge, "you owe", JOptionPane.INFORMATION_MESSAGE);
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "invalid delivery type", "error", JOptionPane.INFORMATION_MESSAGE);
                }
                break;
            case "Next Day Standard":
                if(weight >= WEIGHT)
                    {
                        charge = BOX_STANDARD + (Math.ceil(weight/WEIGHT)*(BOX_STANDARDLB));
                        JOptionPane.showMessageDialog(null, "Charge: $" + charge, "you owe", JOptionPane.INFORMATION_MESSAGE);
                    }
                else if(weight < 0)
                {
                    JOptionPane.showMessageDialog(null, "weight cannot be less than zero", "ERROR", JOptionPane.INFORMATION_MESSAGE);
                }
                else if(weight >= 0 && weight < WEIGHT)
                {
                    charge = BOX_STANDARD;
                    JOptionPane.showMessageDialog(null, "Charge: $" + charge, "you owe", JOptionPane.INFORMATION_MESSAGE);
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "invalid delivery type", "error", JOptionPane.INFORMATION_MESSAGE);
                }
                break;
            case "2-Day":
                if(weight >= WEIGHT)
                    {
                        charge = BOX_TWODAY + (Math.ceil(weight/WEIGHT)*(BOX_TWODAYLB));
                        JOptionPane.showMessageDialog(null, "Charge: $" + charge, "you owe", JOptionPane.INFORMATION_MESSAGE);
                    }
                else if(weight < 0)
                {
                    JOptionPane.showMessageDialog(null, "weight cannot be less than zero", "ERROR", JOptionPane.INFORMATION_MESSAGE);
                }
                else if(weight >= 0 && weight < WEIGHT)
                {
                    charge = BOX_TWODAY;
                    JOptionPane.showMessageDialog(null, "Charge: $" + charge, "you owe", JOptionPane.INFORMATION_MESSAGE);
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "invalid delivery type", "error", JOptionPane.INFORMATION_MESSAGE);
                }
                break;
            default:
                JOptionPane.showMessageDialog(null, "invalid package type", "ERROR", JOptionPane.INFORMATION_MESSAGE);
                break;
        }
break;
        }
    } // end main
     
} // end class