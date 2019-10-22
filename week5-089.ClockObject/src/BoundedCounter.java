public class BoundedCounter {


    private int value;
    private int upperLimit;

    public BoundedCounter(int upperLimit) {
        this.upperLimit = 59;
        this.value = upperLimit;

    }

    public void next() {

        if (this.value >= this.upperLimit) {
            this.value = 0;
        } else {
            this.value++;
        }
    }

    public String toString() {
        // write code here
        return String.format("%02.0f", (float) value);

    }

    public int getValue() {
        return this.value;
    }

    public void setValue(int value) {

        if (value >= 0 && value <= this.upperLimit) {
            this.value = value;

        }
    }

}
