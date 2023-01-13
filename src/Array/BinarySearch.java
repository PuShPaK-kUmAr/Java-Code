package Array;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

    private static int[] input(){
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter the length of Sorted Array : ");
        int arrayLength = userInput.nextInt();
        int[] array = new int[arrayLength];
        for (int count = 0; count < arrayLength; count++) {
            System.out.print("Enter Sorted Array Element " + (count + 1) + " : ");
            array[count] = userInput.nextInt();
        }
        return array;
    }
    public static void main(String[] args) {
        Scanner userTarget = new Scanner(System.in);
        System.out.print("Enter the Target Element :  ");
        int target = userTarget.nextInt();
        int[] array = input();
        while (!isSorted(array)) {
            System.out.println("          Please provide a sorted array!!! ");
            array = input();
        }
        System.out.print("The reversed Array is : " + binary(array,target));
    }

    private static boolean isSorted(int[] array) {
        for (int index = 1; index < array.length; index++) {
            if (array[index] < array[index - 1]) {
                return false;
            }
        }
        return true;
    }


    private static String binary(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;
        int mid;
        while (left <= right) {
            mid = left + (right - left) / 2;
            if (array[mid] == target) {
                return "Target found at index: " + mid;
            } else if (array[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return "Target Element not found in array";
    }
}
