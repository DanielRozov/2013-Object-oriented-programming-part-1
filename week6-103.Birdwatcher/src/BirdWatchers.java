
import java.util.ArrayList;

public class BirdWatchers {

    private ArrayList<Bird> birds;

    public BirdWatchers() {
        this.birds = new ArrayList<Bird>();
    }

    public void addBird(String name, String latinName) {
        birds.add(new Bird(name, latinName));
    }

    public boolean observed(String name) {
        for (Bird bird : birds) {
            if (bird.getName().contains(name)) {
                bird.countObservation();
                return true;
            }
        }
        return false;
    }

    public void showByName(String name) {
        for (Bird bird : birds) {
            if (bird.getName().contains(name)) {
                System.out.println(bird.toString());
            }
        }
    }

    public String statistics() {
        String statistic = "";
        for (Bird bird : birds) {
            System.out.println(bird.toString());
            statistic += bird.toString();
        }
        return statistic;
    }
}
