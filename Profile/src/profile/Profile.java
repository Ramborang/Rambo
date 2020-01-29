
package profile;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Profile {

     @param args the command line arguments
     *//**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String Name;
        int Age;
        double Pay;
       

        Scanner In = new Scanner(System.in);
        
        System.out.println("What is your name?");
        Name = In.next();
        
        System.out.println("What is your age?");
        Age = In.nextInt();
        
        System.out.println("How much do you want to make?");
        Pay = In.nextDouble();
        
        
        System.out.printf("My name is %s. I am %d years old. I would like to make $%.2f.",Name,Age,Pay);
    }
    
}
