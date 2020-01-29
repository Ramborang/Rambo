/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package milk;

import javax.swing.JOptionPane;

public class Milk {

    public static void main(String[] args) {
        
        
        double Liquid;          //amount of liquid collected in the morning
        double cartonliters;    //amount of milk per carton
        double cost;            //cost to produce milk per carton
        double profit;          //profit per carton
        
        Liquid = Double.parseDouble(JOptionPane.showInputDialog("Total amount of milk produced in the morning:"));
        
        cartonliters = 3.78;
        cost = .38;
        profit = 0.27;
                
        System.out.println("The number of milk cartons =" + Liquid/cartonliters);
        System.out.println("the cost to produce the milk is: " + (Liquid/cartonliters)*cost);
        System.out.println("The total profit is: " + (Liquid/cartonliters)*profit);
                
    }
    
}
