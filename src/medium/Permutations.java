package medium;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
    public List<List<Integer>> permute(int[] nums) {
        int x = 1;
        for(int i = nums.length; i > 1; i--){
            x *= i;
        }
        StringBuilder str = new StringBuilder();
        for(int y : nums) {
            str.append((char)('a' + y));
        }
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 0; i < x; i++){
            StringBuilder sb = new StringBuilder(str);
            List<Integer> a = new ArrayList<>();
            int y = i;
            int que = nums.length ;
            while(que > 0) {
                int rem = y % que;
                y = y / que;
                que--;
                a.add(sb.charAt(rem) - 'a');
                sb.deleteCharAt(rem);
            }
            ans.add(a);
        }
        return ans;
    }
}
