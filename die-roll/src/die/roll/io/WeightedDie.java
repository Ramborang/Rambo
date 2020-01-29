package die.roll.io;
import java.util.Random;

public class WeightedDie extends Die {
    
    public WeightedDie(int sides) {
        super(sides);
    }

    /**
    * This method rolls the die and returns the result unfairly
    */
    @Override
    public int roll() {
        Random randomNumGenerator = new Random();
        int randomNumber = randomNumGenerator.nextInt(sides_object) + 1;
        boolean halfChance = randomNumGenerator.nextBoolean();
        if(halfChance) {
            randomNumber += 3;
            if(randomNumber > sides_object) {
                randomNumber = sides_object;
            }
        }
        return randomNumber;
    }
}