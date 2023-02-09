package String;

import java.util.Scanner;

public class RomanToInteger {
    public static int romanToInt(String str) {
        int result = 0;
        for (int index = 0; index < str.length(); index++) {
            char charCase = str.charAt(index);
            switch (charCase) {
                case 'I' -> result += 1;
                case 'V' -> {
                    result += 5;
                    if (index > 0 && str.charAt(index - 1) == 'I') {
                        result -= 2;
                    }
                }
                case 'X' -> {
                    result += 10;
                    if (index > 0 && str.charAt(index - 1) == 'I') {
                        result -= 2;
                    }
                }
                case 'L' -> {
                    result += 50;
                    if (index > 0 && str.charAt(index - 1) == 'X') {
                        result -= 20;
                    }
                }
                case 'C' -> {
                    result += 100;
                    if (index > 0 && str.charAt(index - 1) == 'X') {
                        result -= 20;
                    }
                }
                case 'D' -> {
                    result += 500;
                    if (index > 0 && str.charAt(index - 1) == 'C') {
                        result -= 200;
                    }
                }
                case 'M' -> {
                    result += 1000;
                    if (index > 0 && str.charAt(index - 1) == 'C') {
                        result -= 200;
                    }
                }
                default -> {
                    System.out.println("Invalid Roman character: " + charCase);
                    return -1;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter the roman String to convert into Integer : ");
        String roman = userInput.nextLine();
        int output = romanToInt(roman.toUpperCase());
        if(output == -1){
            System.out.println("Invalid Roman Input");
        }else {
            System.out.println("The Integer of " + roman + " is : " + output);
        }
    }
}
