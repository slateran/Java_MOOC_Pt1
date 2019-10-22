
import java.util.Scanner;

public class BiggerNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Implement your program here. Remember to ask the input from user


        System.out.println("Type a number: ");
        int a = reader.nextInt();
        System.out.println("Type another number: ");
        int b = reader.nextInt();

        int max = Math.max(a,b);

        System.out.println();
        System.out.println("The bigger number of the two numbers given was: " + max);

    }
}
