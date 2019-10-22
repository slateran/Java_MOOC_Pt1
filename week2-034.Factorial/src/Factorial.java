import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a number: ");

        int n = reader.nextInt();
        int count = 1;
        int fac = 1;

        while (count <= n){

            fac *= count ;
            count++;

        }

        System.out.println(fac);




    }
}
