package SortingAlgorithm;
import java.util.Scanner;
import java.util.Arrays;

public class BubbleSort {
      public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        // Read in the array of integers
        System.out.println("Enter the size of the array:");
        int size = userInput.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int index = 0; index < size; index++) {
            array[index] = userInput.nextInt();
        }

        // Perform the bubble sort
        boolean sorted = false;
        while (!sorted) {
            sorted = true;
            for (int index = 0; index < size - 1; index++) {
                if (array[index] > array[index + 1]) {
                    int temp = array[index];
                    array[index] = array[index + 1];
                    array[index + 1] = temp;
                    sorted = false;
                }
            }
        }

        // Print the sorted array
        System.out.println("Sorted array:"+Arrays.toString(array));
    }
}
