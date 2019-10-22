
import java.util.Scanner;


public class TheSumBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int i = reader.nextInt();
        int a = reader.nextInt();
        int sum = 0;
        int count = 0;

        while (i <= a){
            sum += i;
            i++;
        }




        System.out.println("Sum is " + sum);



    }
}
