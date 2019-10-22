
import java.util.Scanner;

public class LowerLimitAndUpperLimit {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // write your code here
        // Write your code here
        int i = reader.nextInt();
        int l = reader.nextInt();




        while(i <= l){

            if (i > l){
                break;
            }
            System.out.println(i);
            i++;
        }

    }
}
