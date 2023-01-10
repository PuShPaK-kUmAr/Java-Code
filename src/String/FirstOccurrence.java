package String;
import java.util.Scanner;

public class FirstOccurrence {
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter First String :");
        String stringOne = userInput.nextLine();
        System.out.println("Enter Second String :");
        String stringTwo = userInput.nextLine();
        int result = findOccurrence(stringOne,stringTwo);
        System.out.print("The First Occurrence Index of Second String in First String is :"+result);
    }

    private static int findOccurrence(String srtOne, String strTwo){
        if(srtOne.length()==strTwo.length()) {
            return 0;
        }
        for(int index=0;index<(srtOne.length()-strTwo.length());index++){
            String stringOccurred = srtOne.substring(index,index+strTwo.length());
            if(strTwo.equals(stringOccurred)){                               // equals is used to compare to strings in java
                return index;
            }
        }
        return -1;
    }
}
