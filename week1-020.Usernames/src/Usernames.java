
import java.util.Scanner;

public class Usernames {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        String alexsUsername = "alex";
        String alexsPassword = "mightyducks";

        String emilysUsername = "emily";
        String emilysPassword = "cat";

        System.out.println("Type your username: ");
        String username = reader.nextLine();

        System.out.println("Type your password: ");
        String password = reader.nextLine();

        if ((alexsUsername.equals(username) && alexsPassword.equals(password))
                || (emilysUsername.equals(username) && (emilysPassword.equals(password)))) {
            System.out.println("You are now logged into the system!");
        } else {
            System.out.println("Your username or password was invalid!");
        }
    }
}
