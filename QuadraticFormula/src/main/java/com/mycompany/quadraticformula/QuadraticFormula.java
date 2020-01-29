/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.quadraticformula;
import java.util.Scanner;
public class QuadraticFormula 
{
    public static void main(String[] args)
    {
    Scanner keyboard=new Scanner(System.in);
    
    double a, b, c, root1, root2;
    double disc;
    
    
    System.out.println("a= ");
    a= keyboard.nextDouble();
    System.out.println("b= ");
    b= keyboard.nextDouble();
    System.out.println("c= ");
    c= keyboard.nextDouble();
    
    if(a==0)
    {    
        System.out.println("error: a cannot equal 0");
    }    
    else
    {
        disc=(b*b)-(4*a*c);
            if(disc<0)
                    {        
                    System.out.println("dicriminant cannot be less than 0.");
                    }
            else if(disc==0)
                    {
                    root1=(((-b)+(Math.sqrt(disc)))/2*a);
                    root2=(((-b)-(Math.sqrt(disc)))/2*a);
                    System.out.printf("x=(%.2f,%.2f)%n",root1, root2);
                    }
            else if(disc>0)
                    {
                    root1=(((-b)+(Math.sqrt(disc)))/2*a);
                    root2=(((-b)-(Math.sqrt(disc)))/2*a);
                    System.out.printf("x=(%.2f,%.2f)%n",root1, root2);
                    }
    }                              
    }
    
}
