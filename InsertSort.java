import java.util.Arrays;
import java.util.Random;

/**
 * This is the package for InsertSort.java
 *
 * The InsertSort program makes a random array.
 * it displays an array of 10 integers,
 * displays the array in numerical order,
 * using insert sort.
 *
 * <p>This class satisfies style checkers.</p>
 *
 * @version 1.0
 * @since 2025-04-11
 */

public final class InsertSort {

    /**
     * The size of the array to be populated. */
    private static final int ARRAYSIZE = 10;

    /**
     * This method sorts an array using the bubble sort algorithm.
     *
     * @param array The array to be sorted.
     * @return The sorted array.
     */
    public static int[] insertSort(final int[] array) {
        // Insert sort algorithm
        for (int i = 1; i < array.length; i++) {
            int sorted = array[i];
            int j = i - 1;

            // Move elements of array[0..i-1], that are greater than sorted,
            // to one position ahead of their current position
            for (; j >= 0 && array[j] > sorted; j--) {
                array[j + 1] = array[j];
            }
            array[j + 1] = sorted;
        }
        return array;
    }
    /**
     * This is a private constructor to satisfy style checker.
     *
     * @exception IllegalStateException Utility class.
     * @see IllegalStateException
     */
    private InsertSort() {
        throw new IllegalStateException("Utility class");
    }

    /**
     * This is the main method.
     *
     * @param args unused.
     */
    public static void main(final String[] args) {
        Random rand = new Random();
        int[] arrayOfInts = new int[ARRAYSIZE];
        int[] sortedArray = new int[ARRAYSIZE];


        // populate array with random numbers
        for (int i = 0; i < ARRAYSIZE; i++) {
            arrayOfInts[i] = rand.nextInt(100);
        }

        // print array to console
        System.out.print("Original array: ");
        System.out.println(Arrays.toString(arrayOfInts));

        // Call Bubble sort function
        sortedArray = insertSort(arrayOfInts);

        // print sorted array to console
        System.out.print("Sorted array: ");
        System.out.println(Arrays.toString(sortedArray));

    }
}
