package die.roll.io;
public class main {
    public static void main(String args[]){
        final int sides=10;        
        WeightedDie twelveSidedDie_W = new WeightedDie(sides);
        Die twelveSidedDie = new Die(sides);

        int result = twelveSidedDie.roll();
        int result2 = twelveSidedDie_W.roll(); 
        System.out.println("Roll " + sides + " sided die: " + result);
        System.out.println("Roll weighted " + sides + " sided die: " + result2);
    } 
}