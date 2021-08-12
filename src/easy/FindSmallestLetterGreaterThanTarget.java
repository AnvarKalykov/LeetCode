package easy;

/*
Given a characters array letters that is sorted in non-decreasing order and a character target, return the smallest character in the array that is larger than target.

Note that the letters wrap around.

For example, if target == 'z' and letters == ['a', 'b'], the answer is 'a'.
 */

public class FindSmallestLetterGreaterThanTarget {
    public char nextGreatestLetter(char[] letters, char target) {
        int left = 0;
        int right = letters.length - 1;

        while (left <= right) {
            int middle = (right + left) / 2;
            if  (letters[middle] > target) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }
        return letters[left % letters.length];
    }
}
