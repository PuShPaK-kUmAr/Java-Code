package Math;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int sumOfCube=0,lastDigit,temp;
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter the number to check if it is Armstrong number : ");
        try {
            int number = userInput.nextInt();

            temp=number;
            while(number>0) {
                lastDigit = number%10; //Getting last digit
                number=number/10;  //Removing last digit from number
                sumOfCube=sumOfCube+(lastDigit*lastDigit*lastDigit); //Calculating sum of cubes of digits
            }
            if(temp==sumOfCube) {
                System.out.println(temp+ " is an armstrong number");
            } else {
                System.out.println(temp+ "is not an armstrong number");
            }
        } catch (InputMismatchException error) {
            System.out.println("Invalid input. Please enter an integer.");
        }
    }
}
