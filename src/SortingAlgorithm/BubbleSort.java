package SortingAlgorithm;
import java.util.Scanner;
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read in the array of integers
        System.out.println("Enter the size of the array:");
        int size = scan.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scan.nextInt();
        }

        // Perform the bubble sort
        boolean sorted = false;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < size - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    sorted = false;
                }
            }
        }

        // Print the sorted array
        System.out.println("Sorted array:"+Arrays.toString(array));
    }
}
