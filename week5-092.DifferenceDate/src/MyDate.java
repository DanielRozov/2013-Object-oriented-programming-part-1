
public class MyDate {

    private int day;
    private int month;
    private int year;

    public MyDate(int day, int montd, int year) {
        this.day = day;
        this.month = montd;
        this.year = year;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(MyDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }

    public int differenceInYears(MyDate comparedDate) {

        int sumOfDays = (this.year - 1) * 365 + ((this.month - 1) * 30)
                + this.day;
        int comparedSumOfDays = (comparedDate.year - 1) * 365
                + ((comparedDate.month - 1) * 30) + comparedDate.day;

        return (int) Math.abs(sumOfDays - comparedSumOfDays) / 365;
    }
}
