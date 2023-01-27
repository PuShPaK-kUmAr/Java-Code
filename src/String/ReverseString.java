package String;
import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        try {
            Scanner userInput = new Scanner(System.in);
            System.out.print("Enter String to reverse :");
            String str = userInput.nextLine();
            if (str.length()==0) {
                throw new IllegalArgumentException("You Forget to Enter String");
            }
            String reverse = reverseString(str);
            System.out.println("The reverse of the string is: " + reverse);

        }catch(Exception error){
            System.out.println("Error : "+ error.getMessage());
        }
    }
        private static String reverseString(String str) {
            try {
                if (str.isEmpty()) {
                    return str;
                }
                return reverseString(str.substring(1)) + str.charAt(0);
            }
            catch(Exception error){
                System.out.println("Error : "+error.getMessage());

            }
            return str;
        }
}





