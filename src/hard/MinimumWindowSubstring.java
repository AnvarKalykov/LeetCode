package hard;


/*
Given two strings s and t of lengths m and n respectively, return the minimum window substring of s such that every character in t (including duplicates) is included in the window. If there is no such substring, return the empty string "".

The testcases will be generated such that the answer is unique.

A substring is a contiguous sequence of characters within the string.
 */


import java.util.HashMap;
import java.util.Map;

public class MinimumWindowSubstring {
    public String minWindow(String s1, String s2) {
        String ans = "";
        Map<Character,Integer> map2 = new HashMap<>();
        for(int i = 0;i<s2.length();i++)
        {
            char ch = s2.charAt(i);
            map2.put(ch,map2.getOrDefault(ch,0)+1);
        }
        int matching_count = 0;
        int desiredMatchingCount = s2.length();

        Map<Character,Integer>map1 = new HashMap<>();
        int i = -1;
        int j = -1;
        while(true)
        {
            boolean f1 = false;
            boolean f2 = false;
            while((i<s1.length()-1) && (matching_count<desiredMatchingCount))
            {
                i++;
                char ch = s1.charAt(i);
                map1.put(ch,map1.getOrDefault(ch,0)+1);
                if(map1.getOrDefault(ch,0)<=map2.getOrDefault(ch,0))
                    matching_count++;
                f1 = true;
            }

            while((j<i) && (matching_count==desiredMatchingCount))
            {
                String possible_ans = s1.substring(j+1,i+1);

                if((ans.length() == 0)||(possible_ans.length() < ans.length()))
                    ans = possible_ans;
                j++;
                char ch = s1.charAt(j);

                if(map1.get(ch) == 1)
                    map1.remove(ch);
                else
                    map1.put(ch,map1.get(ch)-1);
                if(map1.getOrDefault(ch,0)<map2.getOrDefault(ch,0))
                    matching_count--;

                f2 = true;
            }

            if(!f1 && !f2)
                break;

        }

        return ans;
    }
}
