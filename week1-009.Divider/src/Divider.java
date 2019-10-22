
import java.util.Scanner;

public class Divider {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type a number: ");
        double a = reader.nextDouble();
        System.out.println("Type another number: ");
        double b = reader.nextDouble();
        double re = a / b;

        System.out.println();
        System.out.println("Division: " + a + " / " + b + " = " + re);


        // Implement your program here. Remember to ask the input from user.
    }
}
