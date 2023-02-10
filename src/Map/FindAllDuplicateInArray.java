package Map;

import java.util.*;

public class FindAllDuplicateInArray {
    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> result = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                result.add(num);
            } else {
                set.add(num);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        try (Scanner userInput = new Scanner(System.in)) {
            System.out.println("Enter the elements of an array separated by space: ");
            String userString = userInput.nextLine();
            String[] userStr = userString.split(" ");
            int[] nums = new int[userStr.length];
            for (int i = 0; i < userStr.length; i++) {
                try {
                    nums[i] = Integer.parseInt(userStr[i]);
                } catch (NumberFormatException e) {
                    System.out.println("Error: Invalid input. Only integers are allowed.");
                    return;
                }
            }
            List<Integer> result = findDuplicates(nums);
            System.out.println("Duplicate elements in the array: " + result);
        } catch (Exception e) {
            System.out.println("Error: An unexpected error has occurred.");
        }
    }
}