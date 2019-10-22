
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a number: ");
        int a = reader.nextInt();
        int count = 0;
        double pow = 0;
        int sum = 0;

        while (count <= a){

            pow = Math.pow(2, count);
            count++;
            sum += pow;



        }

        System.out.println(sum);

    }
}
