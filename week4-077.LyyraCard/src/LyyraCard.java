
public class LyyraCard {

    private double balance;

    public LyyraCard(double balanceAtStart) {
        this.balance = balanceAtStart;
    }

    public void payEconomical() {
        if (this.balance >= 2.5) {
            this.balance -= 2.5;
        }
    }

    public void payGourmet() {
        if (this.balance >= 4.) {
            this.balance -= 4.;
        }
    }

    public void loadMoney(double amount) {

        if (amount < 0) {
            return;
        }

        this.balance += amount;

        if (this.balance > 150.) {
            this.balance = 150.;
        }

    }

    @Override
    public String toString() {
        return "The card has " + this.balance + " euros";
    }
}
