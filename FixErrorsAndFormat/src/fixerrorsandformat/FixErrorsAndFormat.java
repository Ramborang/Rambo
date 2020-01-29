/*
 * Author: Riley Thompson
 * Date: 1/21/2020
 * Assignment: Assignment1 FixErrorsAndFormat.java
 * Course: COMP243
 * Description: This program has many bugs
 *             fix all of the bugs
 */
package fixerrorsandformat; 
public class FixErrorsAndFormat
{
     
   public static void main(String [] args)
   {    
       
        int number1, number2, number3;
        int area;
        double income, tax, _bonus;
        String message;
        char key;
               
        income=56900.50;
        _bonus=1575.99;      
        message="Hello";
        number1 = 39;
        number2 = 14;
        area = number1 * number2;
        key = 'W';
        tax = 12518.11;
      
        System.out.println("Fix Errors and Format Program - By Riley Thompson"+System.lineSeparator());
        System.out.println("Welcome to RCTC");
        System.out.println("Spring 2019");
        System.out.println("This program has many bugs");
        System.out.println("20+19 = " + (20+19));
   
        System.out.println("Area: " + area);
   
        System.out.println("Sum: " + (number1 + number2));
   
        System.out.println("Quotient: " + (number1 / number2));
   
        System.out.println("Remainder: "  +(number1 % number2));
   
        System.out.println("Income: " + income);
        System.out.println("Tax: " + tax);
        System.out.println("Bonus: " + _bonus);
        System.out.println("Message: " + message);
        System.out.println("Key: " + key);
   
   }//end main
     
}//end class