
import java.util.Scanner;

public class FirstPart {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type a word:");
        String word = reader.nextLine();

        System.out.println("Length of the first part: ");
        int lengthOfTheFirstPart = Integer.parseInt(reader.nextLine());

        String firsPart = word.substring(0, lengthOfTheFirstPart);
        System.out.println("Result: " + firsPart);
    }
}
