
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();

        // program your solution here. Do not touch the above lines!
        int guess = 0;
        while (true) {
            guess++;
            System.out.println("Guess a number: ");
            int number = Integer.parseInt(reader.nextLine());

            if (number == numberDrawn) {
                System.out.println("Congratulations, your guess is correct!");
                break;
            } else if (number < numberDrawn) {
                System.out.println("Number is greater, guess made: " + guess);
            } else {
                System.out.println("The number is lesser, guess made: " + guess);
            }
        }
    }

    // DO NOT MODIFY THIS!
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
