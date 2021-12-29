// You are climbing a staircase. It takes n steps to reach the top.
// Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
public class ClimbingStairs {
    public int climbStairs(int n) {
        if(n == 0) return 0;
        if(n == 1) return 1;
        int[] stairs = new int[n+1];
        stairs[0] = 1;
        stairs[1] = 1;
        for(int i=2; i<=n; i++) {
            stairs[i] = stairs[i-1] + stairs[i-2];
        }
        return stairs[n];
    }
}