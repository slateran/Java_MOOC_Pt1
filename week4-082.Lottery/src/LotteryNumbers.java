import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {
    private ArrayList<Integer> numbers;
    private Random random = new Random();

    public LotteryNumbers() {
        // Draw numbers as LotteryNumbers is created
        this.drawNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void drawNumbers() {
        // We'll format a list for the numbers

        this.numbers = new ArrayList<Integer>();
        // Write the number drawing here using the method containsNumber()

        while (numbers.size() < 7) {

            int r = random.nextInt(39) + 1;
            if (containsNumber(r) == false) {
                numbers.add(r);
            }
        }


    }

    public boolean containsNumber(int number) {
        // Test here if the number is already in the drawn numbers
        if (this.numbers.contains(number)) {
            return true;
        }

        return false;
    }
}
