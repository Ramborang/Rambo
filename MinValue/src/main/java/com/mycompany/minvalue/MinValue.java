/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.minvalue;
import java.util.Scanner;
public class MinValue 
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        
        //declare variables
        int n1, n2, n3, smallest;
        
        //input
        System.out.println("Enter 3 integers: ");
        n1 = keyboard.nextInt();
        n2 = keyboard.nextInt();
        n3 = keyboard.nextInt();
        
         //determine the smallest
        smallest = n1;  // assume n1 is the smallest
        if(n2 < smallest)
        {
            smallest = n2;
        }
        
        if(n3 < smallest)
        {
            smallest = n3;
        }
        
        // print
        System.out.println("\nSmallest Value: " + smallest);
        
    }//end main
}//end class


