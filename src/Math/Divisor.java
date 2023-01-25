package Math;

import java.nio.Buffer;
import java.util.Scanner;

public class Divisor {
    public static void main(String[] args) {
            try{
                Scanner userInput = new Scanner(System.in);
                System.out.println("Enter the dividend : ");
                int dividend = userInput.nextInt();
                System.out.println("Enter the divisor : ");
                int divisor = userInput.nextInt();
                int result = dividend/divisor;
                System.out.println("The result is : " + result);
            }catch (ArithmeticException e){
                // If the type will be double and divisor will be 0 the result become Infinity
                System.out.println("Error : "+e.getMessage());
            }
    }
}
