import java.util.Random;

public class DiceRoller {
    
    // DiceRoller() { // This is local scope
    //     Random random = new Random();
    //     int number = 0;
    //     roll(random, number);
    // }

    // void roll(Random random, int number) {
    //     number = random.nextInt(6) + 1;
    //     System.out.println(number);
    // }
    Random random; // This is global scope
    int number;
    
    DiceRoller() { 
        random = new Random();
        roll();
    }

    void roll() {
        number = random.nextInt(6) + 1;
        System.out.println(number);
    }
}
