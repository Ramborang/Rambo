/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package summerjob;
import java.util.Scanner; 
public class SummerJob {

    public static void main(String[] args) {
        Scanner keyboard=new Scanner(System.in);
        final int weeks=5;
        double pay, tax, clothes, schoolSupply, savingsBonds, hours, income, parentSavings;
        
        
        tax=14;
        /*
        clothes=10;
        schoolSupply=1;
        */
        
        System.out.println("pay rate:");
        pay=keyboard.nextDouble();
        System.out.println("hours worked per week:");
        hours=keyboard.nextDouble();
        
        income=pay*hours*weeks;
        System.out.println("You made $"+income+" before taxes.");
        income=income-(income*tax/100);
        System.out.println("You made $"+income+" after taxes.");
        clothes=income*10/100;
        System.out.println("You spent $"+clothes+" on clothes.");
        schoolSupply=income*1/100;
        System.out.println("You spent $"+schoolSupply+" on school supply.");
        
        income=income-clothes-schoolSupply;
        savingsBonds=income*25/100;
        System.out.println("You spent $"+savingsBonds+" on savings bonds.");
        parentSavings=savingsBonds*0.50;
        System.out.println("Your parents contributed $"+parentSavings+" to your savings bonds.");
    }
    
}
