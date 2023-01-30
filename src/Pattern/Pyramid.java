package Pattern;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter the height of Pyramid as Integer : ");
        try {
            int height = userInput.nextInt();
            pyramid(height);
        } catch (InputMismatchException error) {
            System.out.println("Invalid input! Height must be an integer.");
        }
    }
    private static void pyramid(int height) {
        for (int row = 0; row <= height; row++) {
            for (int spaces = height; spaces >= row; spaces--) {
                System.out.print(" ");
            }
            for (int asterisks = 1; asterisks <= row; asterisks++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
