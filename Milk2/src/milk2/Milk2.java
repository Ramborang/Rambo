package milk2;

import javax.swing.JOptionPane;

public class Milk2 {

    public static void main(String[] args) {
        double Liquid;
        double cartonliters;
        double cost;
        double profit;
        
        Liquid = Double.parseDouble(JOptionPane.showInputDialog("Total amount of milk produced in the morning:"));
        cost = Double.parseDouble(JOptionPane.showInputDialog("Total cost of producing one liter of milk: "));
        profit = Double.parseDouble(JOptionPane.showInputDialog("Total profit for each corton of milk: "));
        
        cartonliters = 3.78;
        
                
        System.out.println("The number of milk cartons =" + Liquid/cartonliters);
        System.out.println("the cost to produce the milk is: " + (Liquid/cartonliters)*cost);
        System.out.println("The total profit is: " + (Liquid/cartonliters)*profit);
    }
    
}
