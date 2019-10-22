import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement your program here
        // do not put all to one method/class but rather design a proper structure to your program

        // Your program should use only one Scanner object, i.e., it is allowed to call
        // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter


        Scanner sc = new Scanner(System.in);

        Database db = new Database();
        String select;

        do {
            System.out.println("?");
            select = sc.nextLine();

            switch (select) {

                case "Add": {
                    System.out.println("Name: ");
                    String name = sc.nextLine();
                    System.out.println("Latin Name: ");
                    String lName = sc.nextLine();
                    db.add(name, lName);
                    break;
                }
                case "Observation": {
                    System.out.println("What was observed:? ");
                    String name = sc.nextLine();
                    db.observe(name);
                    break;
                }
                case "Statistics": {
                    db.stats();
                    break;
                }
                case "Show": {
                    System.out.println("What? ");
                    String name = sc.nextLine();
                    db.show(name);
                    break;
                }


            }
        } while (!select.equals("Quit"));


    }

}
