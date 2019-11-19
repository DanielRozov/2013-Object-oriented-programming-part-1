
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write here the main program
        ArrayList<Student> list = new ArrayList<Student>();
        Scanner reader = new Scanner(System.in);

        while (true) {
            System.out.println("Type a student name:");
            String name = reader.nextLine();

            if (name.isEmpty()) {
                break;
            }

            System.out.println("Type a number of student:");
            String number = reader.nextLine();

            list.add(new Student(name, number));
        }

        for (Student s : list) {
            System.out.println(s);
        }

        System.out.println();

        System.out.println("Give search term:");
        String searchTerm = reader.nextLine();
        System.out.println("Result: ");

        for (Student s : list) {
            if (s.getName().contains(searchTerm)) {
                System.out.println(s);
            }
        }
    }
}
