
public class Player {

    private String name;
    private int amountOfGoal;

    public Player(String name) {
        this(name, 0);
    }

    public Player(String name, int amountOfGoals) {
        this.name = name;
        this.amountOfGoal = amountOfGoals;
    }

    public String getName() {
        return name;
    }

    public int goals() {
        return amountOfGoal;
    }

    @Override
    public String toString() {
        return getName() + ", goals "
                + goals();
    }
}
