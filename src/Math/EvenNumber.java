package Math;

import java.util.Arrays;
import java.util.Scanner;

public class EvenNumber {
    public static void main(String[] args) {
        try {
            Scanner userInput = new Scanner(System.in);
            System.out.println("Enter the number of elements in the array:");
            int element = userInput.nextInt();
            int[] arr = new int[element];

            System.out.println("Enter the elements of the array:");
            for (int index = 0; index < element; index++) {
                arr[index] = userInput.nextInt();
            }

            // Using stream to filter even numbers
            int[] evenNumbers = Arrays.stream(arr)
                    .filter(value -> value % 2 == 0)
                    .toArray();

            System.out.println("Even numbers in the array are:");
            for (int num : evenNumbers) {
                System.out.print(num + " ");
            }
        } catch (Exception error) {
            System.out.println("An error occurred: " + error.getMessage());
        }
    }
}
