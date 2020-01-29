/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.milk2;
import javax.swing.JOptionPane;
public class Milk2 {
    public static void main(String[] args){
        double Liquid;
        double cartonliters;
        double cost;
        double profit;
        
        cartonliters = 3.78;
        
        Liquid = Double.parseDouble(JOptionPane.showInputDialog("Total amount of milk produced in the morning"));
        cost = Double.parseDouble(JOptionPane.showInputDialog("Total cost of producing one liter of milk: "));
        profit = Double.parseDouble(JOptionPane.showInputDialog("Total profit for each carton of milk"));
        
        System.out.println("The number of milk cartons =" + Liquid/cartonliters);
        System.out.println("The cost to produce the milk is: " + (Liquid/cartonliters)*cost);
        System.out.println("The total profit is: " + (Liquid/cartonliters)*profit);
    }        
}
/*
int n1=5
double x
x=n1
this is okay 
x=5.0 (implicit conversion)

double x+5.7
int n1
n1=x
is not okay
we get a compiling error

We have to say 
n1=(int)x;
This is called casting
we are forcing the int so we will lose some value
5.7 will become 5
THEY WILL NOT ROUND!!!
*/