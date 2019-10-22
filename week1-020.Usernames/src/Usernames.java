
import java.util.Scanner;

public class Usernames {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type your username: ");
        String a = reader.nextLine();

        System.out.println("Type your password: ");
        String b = reader.nextLine();

        if ((a.equals("alex") && (b.equals("mightyducks")) || (a.equals("emily") && b.equals("cat")))){
            System.out.println("You are now logged into the system!");
        }else{
            System.out.println("Your username or password was invalid!");
        }



    }
}
