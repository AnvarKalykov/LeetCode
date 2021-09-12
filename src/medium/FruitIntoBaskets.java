package medium;

/*
You are visiting a farm that has a single row of fruit trees arranged from left to right.
The trees are represented by an integer array fruits where fruits[i] is the type of fruit the ith tree produces.

You want to collect as much fruit as possible. However, the owner has some strict rules that you must follow:

You only have two baskets, and each basket can only hold a single type of fruit. There is no limit on the amount of fruit each basket can hold.
Starting from any tree of your choice, you must pick exactly one fruit from every tree (including the start tree) while moving to the right.
The picked fruits must fit in one of your baskets.
Once you reach a tree with fruit that cannot fit in your baskets, you must stop.
Given the integer array fruits, return the maximum number of fruits you can pick.
 */

import java.util.HashMap;

public class FruitIntoBaskets {
    public int totalFruit(int[] fruits) {
        int n = fruits.length;
        int k = 2;
        int i=0;
        int j=0;
        int max = 1;
        HashMap<Integer,Integer> map = new HashMap();

        while(j<n){
            int x = fruits[j];
            map.put(x,map.getOrDefault(x,0)+1);

            if(map.size() < k){
                max = Math.max(max,j-i+1);
                j++;
            }
            else if(map.size() == k){
                max = Math.max(max,j-i+1);
                j++;
            }
            else if(map.size() > k){
                while(map.size() > k){
                    map.put(fruits[i],map.get(fruits[i])-1);

                    if(map.get(fruits[i]) == 0){
                        map.remove(fruits[i]);
                    }
                    i++;
                }
                j++;
            }
        }
        return max;
    }
}
