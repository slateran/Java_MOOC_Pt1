import java.util.Random;

public class PasswordRandomizer {
    // Define the variables
    Random random = new Random();
    private int length;


    public PasswordRandomizer(int length) {
        // Initialize the variable
        this.length = length;
    }

    public String createPassword() {
        // write code that returns a randomized password
        this.random = new Random();

        String pass = "";
        for (int i = 0; i < this.length; i++){

            int number = random.nextInt(26);
            char symbol = "abcdefghijklmnopqrstuvwxyz".charAt(number);
            pass = pass + symbol;

        }

        return pass;
    }


}
