/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.stringpractice;
import java.util.Scanner;
public class StringPractice 
{
    public static void main (String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        //declare variables
        String fullName, firstName, lastName, initials;
        char gender;
        int indexOfSpace, size;
        //input
        System.out.println("Enter the full name: ");
        fullName = keyboard.nextLine(); //if we did 'next' it will only read up to the space so we must do nextLn
         
        System.out.println("Enter the gender: ");
        gender = keyboard.next().charAt(0);

        //calculation
        indexOfSpace = fullName.indexOf(" ");
        firstName = fullName.substring(0, indexOfSpace);
        lastName = fullName.substring(indexOfSpace + 1);
        
        initials = "" + firstName.charAt(0) + lastName.charAt(0);
        //"" is to make it a string
        //char+char does not equal a string
        size = fullName.length();
        
        //print
        System.out.println("\nName: " + lastName + ", " + firstName);
        System.out.println("Initials: " + initials);
        System.out.println("Gender: " + gender);
        System.out.println("Size of Full Name: " + size);
        System.out.println("Upper Case of Full Name: " + fullName.toUpperCase());
    }
}
