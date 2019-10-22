
public class NumberStatistics {

    private int amountOfNumbers;
    private int addedCount;

    public NumberStatistics() {
        // initialize here the object variable amountOfNumbers
        this.amountOfNumbers = 0;
    }

    public void addNumber(int number) {
        // code here
        this.addedCount++;
        this.amountOfNumbers += number;
    }

    public int amountOfNumbers() {
        return this.addedCount;
    }

    public int sum() {
        // code here
        return this.amountOfNumbers;

    }

    public double average() {
        // code here
        if(this.amountOfNumbers == 0){
            return 0;
        }

        return (double) sum() / amountOfNumbers();
    }


}
