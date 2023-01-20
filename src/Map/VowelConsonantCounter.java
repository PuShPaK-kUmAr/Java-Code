package Map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class VowelConsonantCounter {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String inputStr = userInput.nextLine();
        userInput.close();
        System.out.println(counter(inputStr));

    }

    private static String counter(String str){
        int vow = 0;
        int cons = 0;
        String vowelCount = "vowelCount";
        String consonantCount = "consonantCount";
        String vowels;
        vowels = "aeiouAEIOU";
        for(int index=0;index<str.length();index++){
            if(vowels.indexOf(str.charAt(index)) != -1) {
                vow+=1;
            }else{
                cons+=1;
            }
        }
        HashMap<String,Integer> result = new HashMap<>();
        result.put(vowelCount,vow);
        result.put(consonantCount,cons);
        return result.toString();
    }

}
