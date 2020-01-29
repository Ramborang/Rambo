package com.mycompany.time2;
import java.util.Scanner;
public class Time2 {
    public static void main(String[] args){
        Scanner keyboard=new Scanner(System.in);
        
        //declare variables
        int hours, minutes, seconds;
        final double 
        //input
        System.out.println("enter time in seconds: ");
        seconds=keyboard.nextInt();
        
        //calculate
        hours=seconds/3600;
        seconds=seconds%3600;
        minutes=seconds/60;
        seconds=seconds%60;
        
        System.out.println("\nTime in HH:MM:SS formt: \n" +
                            hours + ":" +minutes + ":" +seconds);
        
    } //end main
} //end class
