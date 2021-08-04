package easy;

/*
Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers in the range [1, n] that do not appear in nums.


 */

import java.util.ArrayList;
import java.util.List;

public class FindAllNumbers {
    public List<Integer> findDisappearedNumbers(int[] a) {
        int[] count = new int[a.length+1];
        for(int i : a) {
            count[i]++;
        }

        List<Integer> res = new ArrayList<>();
        for(int i=1; i<count.length; i++) {
            if(count[i] == 0) res.add(i);
        }
        return res;
    }
}
