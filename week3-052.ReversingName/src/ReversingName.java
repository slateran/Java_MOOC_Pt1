import java.util.Scanner;

public class ReversingName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name: ");
        String name = reader.nextLine();
        int l = name.length()-1;

        while(l >= 0){
            System.out.print(name.charAt(l));
            l--;
        }


    }
}
