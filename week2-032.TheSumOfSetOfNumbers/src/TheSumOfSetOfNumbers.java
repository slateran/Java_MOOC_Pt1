
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Until what? ");
        int a = reader.nextInt();
        int sum = 0;

        for (int i = 0; i <= a; i++){
            sum += i;
        }

        System.out.println("Sum is " + sum);


    }
}
