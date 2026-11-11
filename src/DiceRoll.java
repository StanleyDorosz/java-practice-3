import java.util.Random;

public class DiceRoll {
    public static void main(String [] args) {

        Random random = new Random();

        int diceOne = random.nextInt(1,7);
        int diceTwo = random.nextInt(1,7);

        int diceTotal = diceOne + diceTwo;
        int higherDiceValue = Math.max(diceOne, diceTwo);

        System.out.println("Dice 1: " + diceOne);
        System.out.println("Dice 2: " + diceTwo);

        System.out.println("Total: " + diceTotal);
        System.out.println("Higher value: " + higherDiceValue);

    }
}

/*

Write a Java program that simulates rolling two six-sided dice.
Requirements

        1. Use the Random class to generate two random integers from 1 to 6 (inclusive).

        2. Display both dice values.

        3. Calculate and display the sum of the two dice.

        4. Use Math.max() to find and display the larger value.

        Example Output
        Dice 1: 3
        Dice 2: 5
        Total: 8
        Higher value: 5
        Hints:

        • Remember to import java.util.Random.

        • random.nextInt(6) generates an integer from 0 to 5.

        • The results will vary each time you run the program.

 */

