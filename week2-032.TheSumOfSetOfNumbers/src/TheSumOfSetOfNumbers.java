
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int sum = 0;
        int num = 1;

        System.out.println("Until what?");
        int untilWhat = Integer.parseInt(reader.nextLine());

        while (num <= untilWhat) {
            sum += num;
            num++;
        }
        System.out.println("Sum is " + sum);
    }
}
