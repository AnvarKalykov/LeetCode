package easy;
/*
You are climbing a staircase. It takes n steps to reach the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 */
public class ClimbingStairs {

    public int climbStairs(int n) {

        if (n == 1 || n == 2) {
            return n;
        }

        int n1 = 1;
        int n2 = 2;
        int temp = 0;

        for (int i = 3; i < n; i++) {
            temp = n1;
            n1 = n2;
            n2 = n1 + temp;

        }

        return n1 + n2;
    }
}
