package easy;

/*
Given an integer array nums, handle multiple queries of the following type:

Calculate the sum of the elements of nums between indices left and right inclusive where left <= right.
Implement the NumArray class:

NumArray(int[] nums) Initializes the object with the integer array nums.
int sumRange(int left, int right) Returns the sum of the elements of nums between indices left and right inclusive (i.e. nums[left] + nums[left + 1] + ... + nums[right]).
 */

public class RangeSumQueryImmutable {
    int[] prefixSum;
    public RangeSumQueryImmutable(int[] nums) {
        //find the prefix sum, eg cumalative
        prefixSum = new int[nums.length + 1];
        for(int i = 1; i <= nums.length; i++){
            prefixSum[i] = prefixSum[i - 1] + nums[i - 1];
        }
    }

    public int sumRange(int left, int right) {
        return prefixSum[right + 1] - prefixSum[left];
    }
}
