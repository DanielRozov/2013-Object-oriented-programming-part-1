
public class Main {

    public static void main(String[] args) {
        // test your code here

        //Exercise 90.1: Class Team
//        Team barcelona = new Team("FC Barcelona");
//        System.out.println("Team: " + barcelona.getName());
//
//        //Exercise 90.2: Player
//        Player brian = new Player("Brian");
//        Player pekka = new Player("Pekka", 39);
//
//        barcelona.addPlayer(brian);
//        barcelona.addPlayer(pekka);
//        barcelona.addPlayer(new Player("Mikael", 1));
//
//        barcelona.printPlayers();
//        System.out.println("Number of players: " + barcelona.size());
//        System.out.println("Total goals: " + barcelona.goals());
        Team j = new Team("RAGE");
        Player p = new Player("Jaakko");
        j.addPlayer(p);
        j.printPlayers();
    }
}
