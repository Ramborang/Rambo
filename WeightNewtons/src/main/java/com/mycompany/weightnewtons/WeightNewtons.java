/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.weightnewtons;
import java.util.Scanner;
public class WeightNewtons 
{
    public static void main(String[] args)
    {
       Scanner keyboard=new Scanner(System.in);
       
        //create variables
       double weightNewtons, kilograms;
       final double GRAVITY=9.8;
       
        //user input
       System.out.println("Please enter object's mass in kilograms: ");
       kilograms=keyboard.nextDouble();
       if(kilograms<0)
       {
           System.out.println("Objects mass cannot be 0.");
       }
        //calculate
       else
       {
           weightNewtons=kilograms*GRAVITY;
           System.out.println("\nWeight in kilograms is: " + weightNewtons); 
            if(weightNewtons>1000)
            {
                System.out.println("This object is too heavy.");
            }
            if(weightNewtons<10)
            {
                System.out.println("This object is too light.");
            }
       }   
            
    }   //end main
}   //end class
