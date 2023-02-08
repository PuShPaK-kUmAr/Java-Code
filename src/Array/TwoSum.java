package Array;

import java.util.*;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int index = 0; index < nums.length; index++) {
            int complement = target - nums[index];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), index };
            }
            map.put(nums[index], index);
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args) {
        int[] numb = {2, 7, 11, 15};
        int target = 9;
        TwoSum sum = new TwoSum();
        int[] result = sum.twoSum(numb, target);
        System.out.println(Arrays.toString(result));
    }
}
