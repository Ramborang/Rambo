/*
Author: Riley Thompson
Date: 1-21-2020
Program: Dollar.java
Description:    Input purchase amound and cash paid
                Calculate change in coins
                Print the result
 */
package com.mycompany.dollar;
import java.util.Scanner;
public class Dollar {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        
        //declare variables
        double purchaseAmount, cashPaid, change;
        int quarters, dimes, nickels, pennies, cents, remainder;
        final int QUARTERS_VALUE=25, NICKELS_VALUE=5, DIMES_VALUE=10;
        final double CONVERSION = 100;
        
        //input 
        System.out.println("Enter purchase amount: ");
        purchaseAmount= keyboard.nextDouble();
        System.out.println("Enter case paid:");
        cashPaid=keyboard.nextDouble();
        
        //calculate
        change=(cashPaid - purchaseAmount);
        cents=(int)Math.round(change*CONVERSION);
        
        quarters=cents/QUARTERS_VALUE;
        remainder=cents%QUARTERS_VALUE;
        dimes=remainder/DIMES_VALUE;
        remainder=remainder%DIMES_VALUE;
        nickels=dimes/NICKELS_VALUE;
        pennies=remainder%NICKELS_VALUE;
        
        
        //print amounts
        System.out.println("change: "+change);
        System.out.printf("You have: %n%d quarters%n %d dimes%n %d nickels%n %d pennies.%n", 
                quarters, dimes, nickels, pennies);
              
    }
}
/*
if we do 50 - 37.23 we get
12.729999999999997
we can't store 0.73 in memory
we are running out of bits

java has a Math class
utility methods:
    sqrt
    log
    round
    abs...

Java API documentation 8
Math.pow(2,4) is 2 to the power of 4 (equals 16)
Math.sqrt(16) equals 4
Math.abs(-5.9) returns 5.9
*/

/*
int is 4 bytes
long is 8 bytes

Math.round(1272.999999997)=1273
*/