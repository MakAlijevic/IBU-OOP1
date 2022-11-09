package ibu.edu;
import java.util.Random;

public class Dice {
    int numberOfSides;
    private Random random;

    public Dice(int numberOfSides) {
        this.numberOfSides = numberOfSides;
        random = new Random();
    }

    public int roll(){
        int rand = random.nextInt(numberOfSides);
        if(rand == 0){
            return 1;
        }
        return rand;
    }
}
