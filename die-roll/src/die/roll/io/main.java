package die.roll.io;
public class main {
    public static void main(String args[]){
        
        WeightedDie twelveSidedDie_W = new WeightedDie(12);
        Die twelveSidedDie = new Die(12);

        int result = twelveSidedDie.roll();
        int result2 = twelveSidedDie_W.roll();
        System.out.println("Roll 12 sided die: " + result);
        System.out.println("Roll 12 sided weighted die: " + result2);
    } 
}