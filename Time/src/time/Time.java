/*
 * Author: Riley Thompson
 * Date: 1/21/2020
 * Course: COMP243
 * Description: This will take an input of seconds from the user and convert it to
hours:minutes:seconds
 */
package time;
import java.util.Scanner;
public class Time {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int inputTime, hours, minutes, seconds;
        
        System.out.println("input number in seconds:");
        inputTime = keyboard.nextInt();
        
        hours=inputTime/3600;
        
        minutes=((inputTime-(hours*3600))/60);
        
        seconds=inputTime-(hours*3600)-(minutes*60);
        System.out.println(hours+":"+minutes+":"+seconds);
        
        System.out.println();
        System.out.println();
        System.out.println("Hours:");
        hours= keyboard.nextInt();
        System.out.println("Minutes");
        minutes=keyboard.nextInt();
        System.out.println("Seconds");
        seconds=keyboard.nextInt();
        
        inputTime=(3600*hours)+(60*minutes)+(seconds);
        System.out.println(inputTime + " seconds");
        
    }
    
}
