
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Scanner reader = new Scanner(System.in);
        // write here code to ensure that BoundedCounter works as expected
        // before starting 78.3 remove the extra code and use the skeleton shown
        // in the assignment

        BoundedCounter seconds = new BoundedCounter(59);
        BoundedCounter minutes = new BoundedCounter(59);
        BoundedCounter hours = new BoundedCounter(23);

        System.out.println("seconds: ");
        int s = Integer.parseInt(reader.nextLine());
        System.out.println("minutes: ");
        int m = Integer.parseInt(reader.nextLine());
        System.out.println("hours: ");
        int h = Integer.parseInt(reader.nextLine());

        seconds.setValue(s);
        minutes.setValue(m);
        hours.setValue(h);

        for (int i = 0; i < 121; i++) {
            System.out.println(hours + ":" + minutes + ":" + seconds);
            Thread.sleep(1000);
            seconds.next();
            if (seconds.getValue() == 00) {
                minutes.next();
            }
            if (seconds.getValue() == 00 && minutes.getValue() == 00) {
                hours.next();
            }
        }
    }
}
