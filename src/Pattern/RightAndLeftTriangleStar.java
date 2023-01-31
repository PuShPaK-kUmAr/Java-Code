package Pattern;

import java.util.InputMismatchException;
import java.util.Scanner;

public class RightAndLeftTriangleStar {
    public static void main(String[] args) {
        try {
            while(true) {
                Scanner userInput = new Scanner(System.in);
                System.out.print(
                        """
                                    Select option for printing the star as follows :
                                    1. Right Triangle Star
                                    2. Left Triangle star
                                    3. Exit
                                """
                );
                int option = userInput.nextInt();
                if(option == 1 || option ==2 || option ==3) {
                    System.out.println("Enter the height of Pyramid as Integer : ");
                    int height = userInput.nextInt();
                    switch (option) {
                        case 1 -> rightTriangle(height);
                        case 2 -> leftTriangle(height);
                        case 3 -> System.exit(0);
//                    default -> ;
                    }
                }else{
                    System.out.println("Invalid choice, Option must be either 1 or 2 or 3 ");
                }
            }

        } catch (InputMismatchException error) {
            System.out.println("Invalid input! Height must be an integer.");
        }
    }
    private static void rightTriangle(int height){
        for (int row = 0; row <= height; row++) {
            for (int asterisks = 1; asterisks <= row; asterisks++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void leftTriangle(int height){
        for (int row = 0; row < height; row++) {
            for (int spaces = 2*(height-row); spaces >= 0; spaces--) {
                System.out.print(" ");
            }
            for (int asterisks = 0; asterisks <= row; asterisks++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
