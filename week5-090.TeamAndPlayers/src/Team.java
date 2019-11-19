
import java.util.ArrayList;

public class Team {

    private String name;
    private int maxSize;
    private ArrayList<Player> list;

    public Team(String name) {
        this.list = new ArrayList<Player>();
        this.name = name;
        this.maxSize = 16;
    }

    public String getName() {
        return name;
    }

    public void addPlayer(Player player) {
        if (this.list.size() >= this.maxSize) {
            return;
        } else {
            this.list.add(player);
        }
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

    public int size() {
        return this.list.size();
    }

    public int goals() {
        int totalNumberOfGoals = 0;
        for (Player p : list) {
            totalNumberOfGoals += p.goals();
        }
        return totalNumberOfGoals;
    }

    public void printPlayers() {
        for (Player p : this.list) {
            System.out.println(p);
        }
    }
}
