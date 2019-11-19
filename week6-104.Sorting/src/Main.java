
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] values = {8, 3, 7, 9, 1, 2, 4};
        sort(values);
    }

    public static int smallest(int[] array) {
        int smallest = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
            }
        }
        return smallest;
    }

    public static int indexOfTheSmallest(int[] array) {
        int indexOfTheSmallest = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < array[indexOfTheSmallest]) {
                indexOfTheSmallest = i;
            }
        }

        return indexOfTheSmallest;
    }

    public static int indexOfTheSmallestStartingFrom(int[] array, int index) {
        int indexOfTheSmallest = index;

        for (int i = index; i < array.length; i++) {
            if (array[i] < array[indexOfTheSmallest]) {
                indexOfTheSmallest = i;
            }
        }
        return indexOfTheSmallest;
    }

    public static void swap(int[] array, int index1, int index2) {

        int swap = array[index1];
        array[index1] = array[index2];
        array[index2] = swap;
    }

    public static void sort(int[] array) {

        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array));

            int indexOfTheSmallest = indexOfTheSmallestStartingFrom(array, i);
            swap(array, i, indexOfTheSmallest);
        }
    }
}
