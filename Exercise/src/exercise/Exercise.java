/*
 * Author: Riley Thompson
 * Date: 1/21/2020
 * Course: COMP243
 * Assignment: Assignment1 Exercise.java
 * Description: This is an excercise
 */
package exercise;
// a)
import java.util.Scanner;
public class Exercise {

    public static void main(String[] args) {
        // b)
        Scanner keyboard = new Scanner(System.in);
        // c)
        final int SOME_VALUE = 13;
        final double TAX_RATE = 7.85;
        // d)
        int number1, number2, number3;
        String itemName;
        double purchasePrice, tax;
        // e)
        System.out.println("Enter number1");
        number1 = keyboard.nextInt();
        System.out.println("Enter number2");
        number2 = keyboard.nextInt();
        // f)
        System.out.println("number1: "+number1);
        System.out.println("number2: "+number2);
        // g)
        System.out.println("addition: number1+number2="+(number1+number2));
        System.out.println("subtraction: number1-number2="+(number1-number2));
        System.out.println("multiplication: number1*number2="+number1*number2);
        System.out.println("division(/): number1/number2="+number1/number2);
        System.out.println("division(%): number1%number2="+number1%number2);
        
        // h) calculate
        number3 = (number1*3)+number2;
        // i) output value of number3
        System.out.println("number3="+number3);
        // j) recalculate
        number3=number3+SOME_VALUE;
        // k) new output value of number3
        System.out.println("number3="+number3);
        
        // l) Retail item name
        System.out.println("Retail item:");
        itemName = keyboard.next();
        // m) enter decimal
        System.out.println("Decimal number:");
        purchasePrice = keyboard.nextDouble();
        // n) multiply TAX_RATE with purchasePRice and store in tax
        tax=(TAX_RATE*purchasePrice)/100;
        // o) calculate total
        purchasePrice=purchasePrice+tax;
        // p) output result
        System.out.println("The final price with tax is $"+purchasePrice);
    }    
}
