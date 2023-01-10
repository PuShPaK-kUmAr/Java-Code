package Math;
import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int maxNumber = userInput.nextInt();
        int prevNumber = 0;
        int currentNumber = 1;
        System.out.print("Fibonacci series: " + prevNumber + " " + currentNumber + " ");

        while(prevNumber+currentNumber<=maxNumber){
            int nextNumber = prevNumber + currentNumber;
            System.out.print(nextNumber + " ");
            prevNumber = currentNumber;
            currentNumber = nextNumber;
        }
    }
}
