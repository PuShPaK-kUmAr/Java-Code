package Math;

import java.util.Scanner;

public class SwapTwoNumber {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter First number : ");
        int num1 = userInput.nextInt();
        System.out.println("Enter Second number : ");
        int num2 = userInput.nextInt();
        System.out.println("Before Swap :");
        System.out.println("First number is : "+ num1+" Second Number is : "+num2);
        swapNumber(num1, num2);
    }

    public static void swapNumber(int num1, int num2){
         num1 = num1+num2;
         num2 = num1-num2;
         num1 = num1-num2;
        System.out.println("After Swap ");
        System.out.println("First number is : "+ num1+" Second Number is : "+num2);
    }

}
