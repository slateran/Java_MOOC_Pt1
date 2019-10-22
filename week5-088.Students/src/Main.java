
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write here the main program

        Scanner in = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<Student>();


        while (true) {
            System.out.println("name: ");
            String inputName = in.nextLine();
            if (inputName.isEmpty()) {
                break;
            }
            System.out.println("studentnumber: ");
            String inputNum = in.nextLine();

            list.add(new Student(inputName, inputNum));
        }

        for (Student a : list) {
            System.out.println(a.toString());
        }
        System.out.println();
        System.out.println("Give search term: ");
        String search = in.nextLine();
        System.out.println("Result: ");


        for (Student name : list){
           if (name.getName().contains(search)){
               System.out.println(name.toString());
           }
       }

    }
}
