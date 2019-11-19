
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // add here code that tests LyraCard. However before doing 77.6 remove the
        // other code 
        LyyraCard pekkasCard = new LyyraCard(20);
        LyyraCard briansCard = new LyyraCard(30);

        pekkasCard.payGourmet();
        briansCard.payEconomical();

        System.out.println("Pekka: " + pekkasCard);
        System.out.println("Brian: " + briansCard);

        pekkasCard.loadMoney(20);
        briansCard.payGourmet();

        System.out.println("Pekka: " + pekkasCard);
        System.out.println("Brian: " + briansCard);

        pekkasCard.payEconomical();
        pekkasCard.payEconomical();

        briansCard.loadMoney(50);

        System.out.println("Pekka: " + pekkasCard);
        System.out.println("Brian: " + briansCard);

    }

}
