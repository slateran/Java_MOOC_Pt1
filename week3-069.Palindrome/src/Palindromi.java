import java.util.Scanner;

public class Palindromi {

    public static boolean palindrome(String text) {
        // write your code here

        int i = text.length()-1;
        String pal = "";

        while (i >= 0) {
            pal = pal + text.charAt(i);
            i--;
        }

        if (pal.equals(text)){
            return true;
        }

        return false;


    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type a text: ");
        String text = reader.nextLine();
        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
    }

}
