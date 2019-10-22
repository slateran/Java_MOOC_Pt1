import java.util.Scanner;

public class LoopsEndingRemembering {
    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts

        Scanner reader = new Scanner(System.in);
        System.out.println("Type numbers: ");
        double sum = 0;
        double count = 0;
        double av = 0;
        int even = 0;
        int odd = 0;

        while (true) {

            int a = reader.nextInt();
            if (a == -1) {
                break;
            }

            sum += a;
            count++;
            av = (sum / count);

            if (a % 2 == 0){
                even++;
            }else {
                odd++;
            }


        }

        System.out.println("Thank you and see you later!");
        System.out.println("The sum is " + (int) (sum));
        System.out.println("How many numbers: " + (int) count);
        System.out.println("Average: " +av);
        System.out.println("Even numbers: " + even);
        System.out.println("Odd numbers: " + odd);

    }
}
