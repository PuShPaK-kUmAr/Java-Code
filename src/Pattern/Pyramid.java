package Pattern;

import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter the height of Pyramid as Integer : ");
        int height = userInput.nextInt();
        pyramid(height);
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
