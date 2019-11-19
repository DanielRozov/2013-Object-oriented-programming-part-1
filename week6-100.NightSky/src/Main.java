
public class Main {

    public static void main(String[] args) {
        // Test your code here
        //NightSky NightSky1 = new NightSky(0.1, 40, 10);
        //NightSky1.printLine();

        NightSky NightSky2 = new NightSky(8, 4);
        NightSky2.print();

        System.out.println("Number of stars: "
                + NightSky2.starsInLastPrint());
        System.out.println("");

        NightSky2.print();
        System.out.println("Number of stars: "
                + NightSky2.starsInLastPrint());
    }
}
