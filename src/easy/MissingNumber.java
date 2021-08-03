package easy;

import java.util.stream.IntStream;

public class MissingNumber {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int total = IntStream.of(nums).sum();
        return n * (n + 1) / 2 - total;
    }
}
