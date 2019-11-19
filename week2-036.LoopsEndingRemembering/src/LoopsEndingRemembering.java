
import java.util.Scanner;

public class LoopsEndingRemembering {

    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts

        Scanner reader = new Scanner(System.in);
        int limit = 0;
        int sum = 0;
        int numbers = 0;
        int even = 0;
        int odd = 0;

        System.out.println("Type numbers");
        while (limit != -1) {
            limit = Integer.parseInt(reader.nextLine());
            if (limit >= 0) {
                sum += limit;
                numbers++;
                if (limit % 2 == 0) {
                    even++;
                } else {
                    odd++;
                }
            }
        }

        System.out.println("Thank you and see you later!");
        System.out.println("The sum is " + sum);
        System.out.println("How many numbers: " + numbers);

        double average = (double) sum / numbers;
        System.out.println("Average: " + average);
        
        System.out.println("Even numbers: " + even);
        System.out.println("Odd numbers " + odd);
    }
}
