/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.printingservice;
import java.util.Scanner;
public class PrintingService {
    public static void main(String[] args){
        Scanner keyboard=new Scanner(System.in);
        
        int copy;
        final double serviceCharge=3.00, firstTen=7.99, addition=7.25;
        double finalPrice;
        
        System.out.println("How many copies are you ordering?");
        copy=keyboard.nextInt();
        
        if (copy<=10)
            finalPrice=serviceCharge+(copy*firstTen);
        else 
            finalPrice=serviceCharge+(10*firstTen)+((copy-10)*addition);
        
        System.out.printf("your final cost is: $%.2f", finalPrice);
    }
}