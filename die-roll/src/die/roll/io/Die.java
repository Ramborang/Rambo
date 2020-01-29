package die.roll.io;

import java.util.Random;

public class Die {
    //This is the number of sides of this die
    protected int sides_object;

    /**
     *  This is a constructor which defines how many sides this die has.
     */
    public Die(int s) {
        this.sides_object = s;
    }

    /**
    * This method rolls the die and returns the result 
    */
    public int roll() {
        Random randomNumGenerator = new Random();
        int randomNumber = randomNumGenerator.nextInt(sides_object) + 1;
        return randomNumber;
    }
}