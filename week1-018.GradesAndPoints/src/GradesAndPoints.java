
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type the points [0-60]: ");
        int a = reader.nextInt();


        if (a <= 29){
            System.out.println("failed");
        }else if (a >= 30 && a <= 34) {
            System.out.println(1);
        }else if (a >= 35 && a <= 39) {
            System.out.println(2);
        }
        else if (a >= 40 && a <= 44) {
            System.out.println(3);
        }
        else if (a >= 45 && a <= 49) {
            System.out.println(4);
        }
        else if (a >= 50 && a <= 60) {
            System.out.println(5);
        }

    }
}
