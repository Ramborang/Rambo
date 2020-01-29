/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package permutations;
import java.util.Scanner;
public class Permutations {

    public static void main(String[] args) {
        Scanner keyboard=new Scanner(System.in);
        String a, b, c;
        
        System.out.println("enter a:");
        a=keyboard.next();
        System.out.println("enter b:");
        b=keyboard.next();
        System.out.println("enter c");
        c=keyboard.next();
        
        System.out.println(a+b+c);
        System.out.println(a+c+b);
        System.out.println(b+a+c);
        System.out.println(b+c+a);
        System.out.println(c+a+b);
        System.out.println(c+b+a);
        
    }
    
}
