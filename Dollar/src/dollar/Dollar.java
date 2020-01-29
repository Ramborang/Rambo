
package dollar;
import java.util.Scanner;
public class Dollar {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double purchase, paid, change;
        int quarters, dimes, nickels, pennies;
        
        System.out.println("Enter purchase amount:");
        purchase = keyboard.nextDouble();
        System.out.println("Enter amount paid:");
        paid = keyboard.nextDouble();
        change = paid-purchase;
        
        quarters=(int)(change/0.25);
        dimes=(int)((change-(quarters*0.25))/0.10);
        nickels=(int)((change-(quarters*0.25)-(dimes*0.10))/0.05);
        pennies=(int)((change-(quarters*0.25)-(dimes*0.10)-(nickels*0.05))/0.01);
        
        System.out.println("Change: "+change);
        System.out.println();
        System.out.println("Quarters: "+quarters);
        System.out.println("Dimes: "+dimes);
        System.out.println("Nickels: "+nickels);
        System.out.println("Pennies: "+pennies);
        
    }
    
}
