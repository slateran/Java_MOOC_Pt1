
import java.util.Scanner;

public class WordInsideWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type the first word: ");
        String f = reader.nextLine();
        System.out.println("Type the second word: ");
        String s = reader.nextLine();


        int index = f.indexOf(s);


        if (index == -1){
            System.out.println("The word " + "'" + s + "'" + " is not found in the word " + "'" + f + "'");
        }
        else {
            System.out.println("The word " + "'" + s + "'" + " is found in the word " + "'" + f + "'");
        }



    }
}
