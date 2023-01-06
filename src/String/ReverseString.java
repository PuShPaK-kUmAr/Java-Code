package String;
import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        try (Scanner userInput = new Scanner(System.in)) {
            System.out.print("Enter String to reverse :");
            String str = userInput.nextLine();
            String reverse = reverseString(str);
            System.out.println("The reverse of the string is: " + reverse);
        }
    }
        public static String reverseString(String str) {
            if (str.isEmpty()) {
                return str;
            }
            return reverseString(str.substring(1)) + str.charAt(0);
        }
    }





