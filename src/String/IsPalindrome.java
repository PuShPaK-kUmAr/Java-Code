package String;

import java.util.Scanner;

public class IsPalindrome {
    public static void main(String[] args) {
        try {
            Scanner userInput = new Scanner(System.in);
            System.out.print("Enter the String the check for Palindrome : ");
            String inputStr = userInput.nextLine();
            System.out.println("The Given String is : "+(checkPalindrome(inputStr) ? "Palindrome":"Not a Palindrome"));
            checkPalindrome(inputStr);
        }catch (Exception error){
            System.out.println("Error : "+error.getMessage());
        }
    }
    private static boolean checkPalindrome(String str){
        try{
            boolean result = true;
            int length = str.length();

            for (int index = 0; index < length/2; index++) {
                if (str.charAt(index) != str.charAt(length - index - 1)) {
                    result = false;
                    break;
                }
            }
            return result;
        }catch (Exception error){
            System.out.println("Error : "+error.getMessage());
        }
        return true;
    }
}
