
/*
Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
 */

package easy;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Set <Integer> set = new HashSet<Integer>();

        for (int num : nums) {
            set.add(num);
        }

        if (set.size() == nums.length) {
            return false;
        }
        return true;
    }
}
