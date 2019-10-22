
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInAlphabeticalOrder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // create here an ArrayList

        ArrayList <String> words = new ArrayList<String>();

        String word;

        do{
            System.out.println("Type a word: ");
            word = reader.nextLine();
            words.add(word);
        }while(!word.isEmpty());

        Collections.sort(words);
        System.out.println("You typed the following words: ");
        for(String a : words){
            System.out.println(a);
        }


    }
}
