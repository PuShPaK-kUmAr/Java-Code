package math;

import java.util.Scanner;

public class ReverseInteger {
    public static int reverse(int num) throws IllegalArgumentException {
        if (num == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Cannot reverse integer, value is outside the valid range");
        }

        int reversedNum = 0;
        while (num != 0) {
            int digit = num % 10;
            num /= 10;

            // Check for overflow/underflow
            if (reversedNum > Integer.MAX_VALUE / 10 || (reversedNum == Integer.MAX_VALUE / 10 && digit > 7)) {
                throw new IllegalArgumentException("Cannot reverse integer, value is outside the valid range");
            }
            if (reversedNum < Integer.MIN_VALUE / 10 || (reversedNum == Integer.MIN_VALUE / 10 && digit < -8)) {
                throw new IllegalArgumentException("Cannot reverse integer, value is outside the valid range");
            }

            reversedNum = reversedNum * 10 + digit;
        }
        return reversedNum;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer to reverse: ");
        int num = input.nextInt();
        input.close();

        try {
            int reversedNum = reverse(num);
            System.out.println("The reversed integer is: " + reversedNum);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
