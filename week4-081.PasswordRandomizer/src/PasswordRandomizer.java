
import java.util.Random;

public class PasswordRandomizer {

    // Define the variables
    private Random random;
    private int length;

    public PasswordRandomizer(int length) {
        // Initialize the variable
        this.random = new Random();
        this.length = length;
    }

    public String createPassword() {
        // write code that returns a randomized password
        String s = "abcdefghijklmnopqrstuvwxyz";
        String password = "";
        for (int i = 0; i < this.length; i++) {
            password += s.charAt(random.nextInt(26));
        }
        return password;
    }
}
