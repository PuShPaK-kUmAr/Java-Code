package String;
import java.util.Scanner;

public class RemoveDuplicate {
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter the String :");
        String str = userInput.nextLine();
        String result = removeDuplicate(str);
        System.out.print("The result is :"+ result);

    }

    public static String removeDuplicate(String s){
        StringBuilder sb = new StringBuilder();
        sb.append(s.charAt(0));
        if(s.length()==0){
            return null;
        }
        for(int i=1;i<s.length();i++){
            if(sb.indexOf(String.valueOf(s.charAt(i))) < 0) sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}
