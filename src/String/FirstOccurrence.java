package String;
import java.util.Scanner;

public class FirstOccurrence {
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter First String :");
        String s1 = userInput.nextLine();
        System.out.println("Enter Second String :");
        String s2 = userInput.nextLine();
        int res = findOccurrence(s1,s2);
        System.out.print("The First Occurrence Index of Second String in First String is :"+res);
    }

    private static int findOccurrence(String s1, String s2){
        if(s1.length()==s2.length()) {
            return 0;
        }
        for(int i=0;i<(s1.length()-s2.length());i++){
            String k = s1.substring(i,i+s2.length());
            if(s2.equals(k)){                               // equals is used to compare to strings in java
                return i;
            }
        }
        return -1;
    }
}
