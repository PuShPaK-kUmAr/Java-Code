package String;
import java.util.Scanner;

public class RemoveDuplicate {
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter the String :");
        String inputStr = userInput.nextLine();
        String result = removeDuplicate(inputStr);
        System.out.print("The result is :"+ result);

    }

    public static String removeDuplicate(String str){
        StringBuilder userInput = new StringBuilder();
        userInput.append(str.charAt(0));
        if(str.length()==0){
            return null;
        }
        for(int index=1;index<str.length();index++){
            if(userInput.indexOf(String.valueOf(str.charAt(index))) < 0) userInput.append(str.charAt(index));
        }
        return userInput.toString();
    }
}
