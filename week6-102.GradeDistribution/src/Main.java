
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Grade grade = new Grade();
        // implement your program here
        // do not put all to one method/class but rather design a proper structure to your program

        // Your program should use only one Scanner object, i.e., it is allowed to call 
        // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter
        System.out.println("Type exam scores, -1 completes:");
        while (true) {
            int score = Integer.parseInt(reader.nextLine());

            if (score <= -1) {
                System.out.println("Grade distribution: ");
                grade.printStars();
                System.out.println("Acceptance percentage: "
                        + grade.acceptancePercentage());
                return;
            }
            
            if (score >= 0 && score <= 60) {
                grade.addGrade(score);
            }
        }
    }
}
