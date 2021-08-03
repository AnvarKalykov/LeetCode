package easy;

public class MissingNumber {
    public int missingNumber(int[] nums) {
        int ogsum = 0;
        int sum = 0;
        if (nums.length == 1 && nums[0] == 0) return 1;
        else
        {
            for (int i = 0; i < nums.length; i++)
            {
                ogsum += i;
                sum += nums[i];
            }
            return ogsum + nums.length - sum;
        }
    }
}
