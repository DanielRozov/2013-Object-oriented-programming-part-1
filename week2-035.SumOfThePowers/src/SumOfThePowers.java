
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type a number: ");
        int limit = Integer.parseInt(reader.nextLine());
        int result = 0;
        int pow = 0;

        while (pow <= limit) {
            result += (int) Math.pow(2, pow);
            pow++;
        }
        System.out.println("The result is: " + result);
    }
}
