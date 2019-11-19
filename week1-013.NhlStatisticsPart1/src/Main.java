
import nhlstats.NHLStatistics;

public class Main {

    public static void main(String[] args) {

//        System.out.println("Top ten by points");
//        NHLStatistics.sortByPoints();
//        NHLStatistics.top(10);
//        NHLStatistics.searchByPlayer("Koivu");
        NHLStatistics.sortByGoals();
        System.out.println("Top ten by goals");
        NHLStatistics.top(10);

        NHLStatistics.sortByPenalties();
        System.out.println("Top ten by penalties");
        NHLStatistics.top(25);

        System.out.println("Statistics for Sidney Crosby");
        NHLStatistics.searchByPlayer("Sidney Crosby");

        System.out.println("Statistics for Philadephia Flyers by points");
        NHLStatistics.teamStatistics("PHI");
        NHLStatistics.sortByPoints();

        System.out.println("Players in Anaheim Ducks by points");
        NHLStatistics.teamStatistics("ANA");
        NHLStatistics.sortByPoints();

    }
}
