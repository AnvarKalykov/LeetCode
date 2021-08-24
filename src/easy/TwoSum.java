package easy;

/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.
 */

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numsToMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (numsToMap.containsKey(target - nums[i])) {
                return new int[] {numsToMap.get(target - nums[i]), i};
            }
            numsToMap.put(nums[i],i);
        }
        return null;
    }
}
