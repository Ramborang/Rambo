/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.milk;
import javax.swing.JOptionPane;
public class Milk {
    
    public static void main(String[] args) {
        double Liquid, profitCartonLiters, costCartonLiters;
        final double CARTON_LITERS=3.78;
        final double COST=0.38;
        final double profit=0.27;
        
        Liquid = Double.parseDouble(JOptionPane.showInputDialog("Total amount of milk prduced" + 
                " in the morning: "));
        
        if(Liquid <= 0)
        {
            System.out.println("Error");
        }
        else
        {
            profitCartonLiters = ((Liquid/CARTON_LITERS)*profit);
            costCartonLiters = (Liquid/CARTON_LITERS)*COST;
            //should run calculations before putting them into System outputs
            System.out.println("The number of milk cartons = " + Liquid/CARTON_LITERS);
            System.out.printf("The cost to produce the milk is: $%.2f%nThe total "
                    + "profit is: $%.2f",costCartonLiters, profitCartonLiters);
        } 
        
        System.exit(0);
    }
}
/*
cost = milkQuanitiy*0.95
o.95 is called a hard code
avoide using hard code!!
instead use constants
final double = CARTON_CAPACIY = 3.78;
final double = COST_OF_ONE_LITER = 0.95;
final double = PROFIT_PER_CARTON = 0.9;
and replace hard code with constants
note how he formated constants: all caps and underscores
*/


/*
string s1
s1="Hello World"
s1 is an array of 11 characters (chars)
each char eccupies one cell
each cell has an index

We can manipulate a string
use string methods to manipulate the string
check java documentation for string classes
example methods:
s1.charAt(2);
will return 'l'
s1.charAt(6)
will return 'W'
indexOf()
indexOf("r")
will return 8 .         it finds the index number
indexOf("l")
will return 2 as that is the first occurence of the letter 'l' in "Hello World"
lastIndexOf("l") will return 9 as it works backward
s1.length() will return the size of the string
for this example it will return 11 as that is the length of the string "Hello World


substring()
s1.substring(0, 5); will return "Hello"
it goes all of the way to 5 but not including 5 so be careful
think of it as [0, 5) it includes 0 but not 5
s1.substring(6) will go from 6 all the way to the end
will return "World" in this example.

toLowerCase()
will return all lower case
toUperCase()
will return all upper case
*/