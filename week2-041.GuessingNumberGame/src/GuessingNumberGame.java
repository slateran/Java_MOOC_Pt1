
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();
        int input = 0;
        System.out.println(numberDrawn);
        int count = 0;


        while (input != numberDrawn){


            System.out.println("Guess a number: ");
            input = reader.nextInt();

            count++;

            if (input > numberDrawn){
                System.out.println("The number is lesser, guesses made " + count);
            }if( input < numberDrawn){
                System.out.println("The Number is greater, guesses made " + count);
            }if (input == numberDrawn){
                break;
            }

        }
        System.out.println("Congratulations, your guess is correct!");


        // program your solution here. Do not touch the above lines!



        
    }

    // DO NOT MODIFY THIS!
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
