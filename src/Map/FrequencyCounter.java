package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Map;


public class FrequencyCounter {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter the string: ");
        try {
            String userStr = userInput.nextLine();
            frequency(userStr);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            userInput.close();
        }
    }

    private static void frequency(String str){
        HashMap<Character, Integer> map = new HashMap<>();
        for(var index=0;index<str.length();index++){
            var character = str.charAt(index);
            if(map.containsKey(character)){
                map.put(character,map.get(character)+1);
            }else{
                map.put(character,1);
            }
        }

        System.out.println("Character frequency:");
        Iterator<Map.Entry<Character, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Character, Integer> entry = iterator.next();
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
