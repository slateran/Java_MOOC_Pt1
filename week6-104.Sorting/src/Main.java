import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // write testcode here
        int[] values = {22,64,24,645,0,2532, 4563,5437,57344};
        sort(values);
    }

    public static int smallest(int[] array) {
        // write the code here
        int a = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] < a) {
                a = array[i];
            }
        }
        return a;
    }

    public static int indexOfTheSmallest(int[] array) {
        // code goes here
        int a = array[0];
        int min = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < array[min]) {
                a = i;
            }
        }
        return a;
    }

    public static int indexOfTheSmallestStartingFrom(int[] array, int index) {
        // write the code here
        int min = index;


        for (int i = index; i < array.length; i++) {
            if (array[i] < array[min]) {
                min = i;
            }
        }
        return min;
    }

    public static void swap(int[] array, int index1, int index2) {
        // code goes here

        for (int i = 1; i < array.length; i++) {
            for (int j = 0; j < i; j++) {
                int temp = array[index1];
                array[index1] = array[index2];
                array[index2] = temp;
            }
        }
    }

    public static void sort(int[] array) {

        for (int i = 1; i < array.length; i++) {
            System.out.println(Arrays.toString(array));

            for (int j = 0; j < i; j++) {
                if (array[i] < array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
}
