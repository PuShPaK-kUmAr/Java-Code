package Math;

import java.util.Scanner;

public class AtoiFunction {
    public static int atoi(String str) {
        int i = 0;
        int n = str.length();

        // 1. Read in and ignore any leading whitespace
        while (i < n && str.charAt(i) == ' ') {
            i++;
        }

        // 2. Check if the next character (if not already at the end of the string) is '-' or '+'
        boolean isNegative = false;
        if (i < n && (str.charAt(i) == '-' || str.charAt(i) == '+')) {
            isNegative = str.charAt(i) == '-';
            i++;
        }

        // 3. Read in next the characters until the next non-digit character or the end of the input is reached
        int result = 0;
        while (i < n && Character.isDigit(str.charAt(i))) {
            int digit = str.charAt(i) - '0';
            if (result > (Integer.MAX_VALUE - digit) / 10) { // check for overflow
                throw new IllegalArgumentException("Input is too large or too small");
            }
            result = result * 10 + digit;
            i++;
        }

        // 4. Convert these digits into an integer and change the sign as necessary
        return isNegative ? -result : result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();
        try {
            int output = atoi(input);
            System.out.println("Output: " + output);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

