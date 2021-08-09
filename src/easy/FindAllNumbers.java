package easy;

/*
Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers in the range [1, n] that do not appear in nums.


 */

import java.util.ArrayList;
import java.util.List;

public class FindAllNumbers {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int[] arr = new int[nums.length + 1];
        List<Integer> tist = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            arr[nums[i]]++;
        }

        for (int i = 1; i < nums.length + 1; i++) {
            if (arr[i] == 0) {
                tist.add(i);
            }
        }
        return tist;

    }
}
