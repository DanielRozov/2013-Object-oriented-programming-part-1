
import java.util.Scanner;

public class Grade {

    private int[] grades;

    public Grade() {
        this.grades = new int[6];
    }

    public void addGrade(int score) {
        grades[grade(score)]++;
    }

    public int grade(int score) {
        if (score >= 0 && score <= 29) {
            return 0;
        } else if (score <= 34) {
            return 1;
        } else if (score <= 39) {
            return 2;
        } else if (score <= 44) {
            return 3;
        } else if (score <= 49) {
            return 4;
        } else if (score <= 60) {
            return 5;
        }
        return -1;
    }

    public void printStars() {
        for (int i = grades.length - 1; i >= 0; i--) {
            System.out.print(i + ": ");
            for (int j = 0; j < grades[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public double acceptancePercentage() {
        int allScores = 0;

        for (int grade : grades) {
            allScores += grade;
        }
        
        int acceptance = allScores - grades[0];

        if (acceptance > 0) {
            return 100 * acceptance / allScores;
        }

        return 0.0;
    }
}
