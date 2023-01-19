package Array;
import java.util.HashMap;
import java.util.Scanner;

public class FrequencyCounter {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Please enter a list of items separated by space: ");
        String input = userInput.nextLine();
        userInput.close();

        String[] items = input.split(" ");
        HashMap<String, Integer> frequencyMap = new HashMap<>();

        // Count the frequency of each item
        for (String item : items) {
            if (frequencyMap.containsKey(item)) {
                int count = frequencyMap.get(item);
                frequencyMap.put(item, count + 1);
            } else {
                frequencyMap.put(item, 1);
            }
        }

        // Print the frequency of each item
        for (String key : frequencyMap.keySet()) {
            System.out.println("Item '" + key + "' appears " + frequencyMap.get(key) + " times.");
        }
    }
}
