import java.util.Scanner;

public class TheEndPart {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type a word: ");
        String in = reader.nextLine();
        System.out.println("Length of the end part: ");
        int a = reader.nextInt();

        System.out.println("Result: " + in.substring(in.length() - a));
    }
}
