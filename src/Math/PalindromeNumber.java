package Math;

import java.util.Scanner;

//Given an integer x, return true if x is a
//palindrome
//, and false otherwise.
public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int x;
        try {
            x = scanner.nextInt();
            boolean isPalindrome = isPalindrome(x);
            System.out.println(x + " is " + (isPalindrome ? "" : "not ") + "a palindrome");
        } catch (Exception e) {
            System.out.println("Invalid input");
        } finally {
            scanner.close();
        }
    }

    public static boolean isPalindrome(int x) {
        // Negative numbers are not palindromes
        if (x < 0) {
            return false;
        }

        int reversed = 0;
        int original = x;

        while (original != 0) {
            int digit = original % 10;
            reversed = reversed * 10 + digit;
            original /= 10;
        }

        return x == reversed;
    }
}
