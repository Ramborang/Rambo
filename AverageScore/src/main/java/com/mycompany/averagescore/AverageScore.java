/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.averagescore;
import java.util.Scanner;
//This program demonstrates the if statement.
public class AverageScore {
    public static void main(String[] args){
        double score1, score2, score3, average; 
        
        Scanner keyboard=new Scanner(System.in);    
        
        System.out.println("This program averages 3 test scores.");
        
        // Get the first score.
        System.out.println("Enter score #1: ");
        score1= keyboard.nextDouble();
        // Get the second score.
        System.out.println("Enter score #2: ");
        score2= keyboard.nextDouble();
        // Get the third score.
        System.out.println("Enter score #3: ");
        score3= keyboard.nextDouble();
        
        //Calc and display average score
        average=(score1+score2+score3)/3.0;
        System.out.println("The average is: "+average);
        
        //If the average score is higher than 95, congratulate the user
        if (average > 95)
            System.out.println("That's a great score!");
    }
}