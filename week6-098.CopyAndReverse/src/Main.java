
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write testcode here
        int[] original = {1, 2, 3, 4};
        int[] copied = copy(original);

        // change the copy
        copied[0] = 99;

        // printing both
        System.out.println("original: " + Arrays.toString(original));
        System.out.println("copied: " + Arrays.toString(copied));

        System.out.println("");

        int[] reversed = reverseCopy(original);

        // printing both
        System.out.println("original: " + Arrays.toString(original));
        System.out.println("reversed: " + Arrays.toString(reversed));
    }

    public static int[] copy(int[] array) {
        int[] newArray = new int[array.length];

        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = array[i];
        }
        return newArray;
    }

    public static int[] reverseCopy(int[] array) {
        int[] reversed = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            reversed[i] = array[array.length - 1 - i];
        }

        return reversed;
    }

}
