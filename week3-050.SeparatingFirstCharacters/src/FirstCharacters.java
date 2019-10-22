import java.util.Scanner;

public class FirstCharacters {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name: ");
        String t = reader.nextLine();
        int j = 1;

        if (t.length() < 3) {
            System.out.println();
        } else {
            for (int i = 0; i < 3; i++) {
                System.out.println(j + ". character: " + t.charAt(i));
                j++;
            }
        }

    }
}
