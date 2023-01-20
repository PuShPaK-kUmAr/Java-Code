package Array;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray extends Thread {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter the length of Array : ");
        int arrayLength = userInput.nextInt();
        int[] element = new int[arrayLength];
        for (int count = 0; count < arrayLength; count++) {
            System.out.print("Enter Element " + (count + 1) + " : ");
            element[count] = userInput.nextInt();
        }
            System.out.print("The reversed Array is : " + reverse(element));
    }

    public static String reverse(int[] array) {
        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
        return Arrays.toString(array);
    }
}