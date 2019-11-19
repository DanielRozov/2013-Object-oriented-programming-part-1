
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement your program here
        // do not put all to one method/class but rather design a proper structure to your program

        // Your program should use only one Scanner object, i.e., it is allowed to call 
        // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter
        Scanner reader = new Scanner(System.in);
        BirdWatchers birdWatchers = new BirdWatchers();

        while (true) {

            String command = reader(reader, "?");

            if (command.contains("Quit")) {
                break;
            } else if (command.contains("Add")) {
                add(reader, birdWatchers);
            } else if (command.contains("Observation")) {
                observation(reader, birdWatchers);

            } else if (command.contains("Statistics")) {
                birdWatchers.statistics();

            } else if (command.contains("Show")) {

                System.out.println("What?");
                String name = reader.nextLine();

                birdWatchers.showByName(name);
            }
        }
    }

    public static String reader(Scanner scanner, String word) {
        System.out.println(word);
        return scanner.nextLine();
    }

    public static void add(Scanner scanner, BirdWatchers birdWatchers) {
        String name = reader(scanner, "Name:");
        String latinName = reader(scanner, "Latin Name:");

        birdWatchers.addBird(name, latinName);
    }

    public static void observation(Scanner scanner, BirdWatchers birdWatchers) {
        String name = reader(scanner, "What was observed?:");

        boolean success = birdWatchers.observed(name);
        if (!success) {
            System.out.println("Is not a bird!");
        }

    }
}
