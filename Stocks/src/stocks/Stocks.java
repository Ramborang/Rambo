/*
 * Author: Riley Thompson
 * Date: 1/21/2020
 * Course: COMP243
 * Description: This program will allow users to input number of shares, the purchase price of each share, and the selling price of each share
                The program then outputs the amount invested, the total service charege, amount gained or lost, and the amount received after selling the stock
 */
package stocks;
import java.util.Scanner;
public class Stocks {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int numberShares;
        double purchasePrice, sellingPrice, amountInvested, totalService, amountGain, amountSell;
        final double SERVICE_COST = 0.015;
        
        System.out.println("How many shares did you buy?");
        numberShares = keyboard.nextInt();
        System.out.println("How much did you buy each share for?");
        purchasePrice=keyboard.nextDouble();
        System.out.println("How much did you sell each share for?");
        sellingPrice=keyboard.nextDouble();
        
        amountInvested=numberShares*purchasePrice;
        amountSell=numberShares*sellingPrice;
        totalService=((amountInvested*SERVICE_COST))+((amountSell*SERVICE_COST));
        amountGain=amountSell-amountInvested-totalService;
        
        System.out.println("you bught "+numberShares+" shares.");
        System.out.println("You made $"+(amountSell-amountInvested)+" outside of the service cost.");
        System.out.println("You made $"+amountGain+" including the service cost");
    }
    
}
