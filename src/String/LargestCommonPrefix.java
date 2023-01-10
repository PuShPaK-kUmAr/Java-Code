package String;

import java.util.Arrays;
import java.util.Scanner;

public class LargestCommonPrefix {

    public static String findLargestCommonPrefix(String[] strings) {
        if (strings.length == 0) {
            return "";
        }
        if (strings.length == 1) {
            return strings[0];
        }

        // Sort the array so that we can compare the strings in a pairwise manner.
        Arrays.sort(strings);

        // Initialize the largest common prefix to be the first string
        String largestCommonPrefix = strings[0];

        for (int index = 1; index < strings.length; index++) {
            // Find the common prefix between the largest common prefix and the current string
            largestCommonPrefix = findCommonPrefix(largestCommonPrefix, strings[index]);

            // If there is no common prefix, we can return an empty string
            if (largestCommonPrefix.isEmpty()) {
                return "";
            }
        }

        return largestCommonPrefix;
    }

    public static String findCommonPrefix(String str1, String str2) {
        int minLength = Math.min(str1.length(), str2.length());
        for (int index = 0; index < minLength; index++) {
            if (str1.charAt(index) != str2.charAt(index)) {
                return str1.substring(0, index);
            }
        }
        return str1.substring(0, minLength);
    }

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter the number of strings as Integer value : ");
        int strSize = userInput.nextInt();

        String[] strings = new String[strSize];
        for (int initialSize = 0; initialSize < strSize; initialSize++) {
            System.out.print("Enter string " + (initialSize+1) + ": ");
            strings[initialSize] = userInput.next();
        }
        // Returning the output
        System.out.println("The Largest common prefix in the given strings is :"+findLargestCommonPrefix(strings));
    }
}

