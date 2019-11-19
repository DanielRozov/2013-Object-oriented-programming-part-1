
public class BoundedCounter {

    private int value;
    private int upperLimit;

    public BoundedCounter(int upperLimit) {
        this.upperLimit = upperLimit;
        this.value = 0;
    }

    public void next() {
        this.value++;

        if (this.value > this.upperLimit) {
            this.value = 0;
        }
    }

    public void setValue(int param) {
        if (param < 0 || param > this.upperLimit) {
            return;
        }
        this.value = param;
    }

    public int getValue() {
        return this.value;
    }

    @Override
    public String toString() {
        if (this.value < 10) {
            return "0" + this.value;
        } else {
            return "" + value;
        }
    }
}
