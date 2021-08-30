package medium;

import java.util.LinkedList;
import java.util.List;

public class FindAllDuplicatesInArray {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> answer = new LinkedList<>();
        for(int i = 0; i<nums.length; i++)
        {
            int j = Math.abs(nums[i])-1;
            if(nums[j] >= 0)
                nums[j] *= -1;
            else
                answer.add(j + 1);

        }
        return answer;
    }
}
