
package storeprofit;
import java.util.Scanner;
public class StoreProfit {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        double originalPrice, percentage, taxRate, sellingPrice, salesTax, finalPrice;
        String salesItem;
        
        System.out.println("item:");
        salesItem=keyboard.next();
        System.out.println("original price:");
        originalPrice=keyboard.nextDouble();
        System.out.println("marked up percentage:");
        percentage=keyboard.nextDouble();
        System.out.println("sales tax rate:");
        taxRate=keyboard.nextDouble();
        
        //calculations
        sellingPrice=originalPrice+((originalPrice*percentage)/100);
        salesTax=sellingPrice*taxRate/100;
        finalPrice=sellingPrice+salesTax;
        
        //outputs
        System.out.println("The original price of "+salesItem+" is "+originalPrice);
        System.out.println("The mark up percentage of the item is "+percentage+"%.");
        System.out.println("The selling price of the item is $"+sellingPrice);
        System.out.println("The sales tax rate is "+taxRate+"%.");
        System.out.println("The sales tax is $"+salesTax);
        System.out.println("The final price of the item is $"+finalPrice);
        
        
    }
    
}
