/*
 * Author: Riley
 * Date 1/14/2020
 * Progam: HelloWorld.java
 * Description: This is my first java program.
 */

package com.mycompany.helloworld;
/*
 the basic unit of java is a class
 name of the public class must be the name of the file
 HelloWorld.java
*/
public class HelloWorld {
    /*
    methods a mothod is a sequence of statements (commands/instructions)
    main method: entry point of the program
    */
    public static void main(String [] args){
        /*
        declare variables
        these are the variables that we will use in the program
        */
        int number1, number2, sum;
        /*  int is reserving 4 bytes of space
            double is reserving 8 bytes
            char is for a single character (not two). it reserves 2 bytes
            eg. 'H'
        */
        double radius, circleArea, circumference;
        char key;

        //Define constant
        final double PI = 3.14;
        //by convention we use uppercase for constants
        //eg. INTEREST_RATE
        /*
        +=
        -=
        *=
        /=
        %=
        int n1=5,n2=10
        n2=n2+n1 or n2+=n1
        n2++ is n2=n2=1
        */
        /*
        operator precedence
        (n1+n2+n3)/3 (use parenthesis)
        */
        /*
        initialize variable
        */
        number1=25;
        number2=81;
        
        radius=6.85;
        
        key = 'H';
        /*
        calculate
        */     
        sum=number1+number2;
        circleArea=PI*radius*radius;
        circumference=2*PI*radius;
        /*
        arithmetic operators (+,-,*,/,%) both / and % are used for division
        */
        /*
        case matter
        */
        System.out.println("Hello World!");                     //System.out is standard output device
        System.out.print("My names is \"Riley Thompson\".\n");       //.println is a method
        System.out.println("\nThis is my first Java Program"); 
        
        System.out.println(); //print blank line
        System.out.println(number1 + "+" +number2 + "="+sum);
        System.out.println("Radius = "+ radius);
        System.out.println("Area = "+ circleArea);
        System.out.println("Circumference = " + circumference);
        System.out.println("Key = "+key);
        
        System.out.println();
        System.out.println("27/4="+(27/4));
        System.out.println("27%4="+(27%4));
        System.out.println("27.0%4.0="+(27.0%4.0));
        System.out.println("27.0/4.0="+(27.0/4.0));
        
    } //end main
}  // end class
/*
Escape sequences
\n = new line
\ = quote ("")
*/

/*
    Variables
    Reserve memory space for data items
    Java has data types: primitive and reference
    Java has a total of 8 primitives:
        byte, short, int, long, float, double, char, boolean
        we will focus on int, double, and char
        int = integer       
*/
/*
naming rules and convention for variables
When you name a variable you can only use letters, digits, $, and _
You cannont start with a digit
eg. int $n1
    int _n1
    int n1$
    int 5n is not okay
    
    Try to use meaningful names. Something you can remember and relates to the variable
    
Convention:
    lowercase. second word will be uppercase
    eg. circleArea
*/
/*
two operators for division
5/2=2 (not 2.5) this operator is for the quotient
5.0/2.0 = 2.5
The difference is int vs. double
5%2 is for remainders
5%2=1 (This is a remainder of 1 when you divide 5 and 2
5.0%2.0=1
*/
/*
Constants cannot be changed as the name implies
*/