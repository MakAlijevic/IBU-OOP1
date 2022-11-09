package ibu.edu;

public class Task2 {
    public static void main(String[] args) {
        Dice dice = new Dice(5);

        for(int i = 0; i < 20; i++) {
            int numRolled = dice.roll();
            System.out.println(numRolled);
        }
    }
}
