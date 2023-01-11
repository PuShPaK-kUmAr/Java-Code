package Array;
import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int arrLength = userInput.nextInt();
        int[] arr = new int[arrLength];
        for (int count = 0; count < arrLength; count++) {
            System.out.print("Enter the element "+(count+1)+ " :");
            arr[count] = userInput.nextInt();
        }
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int index = 0; index < arrLength; index++) {
            if (arr[index] > largest) {
                secondLargest = largest;
                largest = arr[index];
            } else if (arr[index] > secondLargest && arr[index] != largest) {
                secondLargest = arr[index];
            }
        }
        System.out.println("Second Largest element in the array is: " + secondLargest);
    }
}
