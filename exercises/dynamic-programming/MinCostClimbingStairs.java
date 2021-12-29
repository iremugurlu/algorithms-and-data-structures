// You are given an integer array cost where cost[i] is the cost of ith step on a staircase. Once you pay the cost, you can either climb one or two steps.
// You can either start from the step with index 0, or the step with index 1.
// Return the minimum cost to reach the top of the floor.
public class MinCostClimbingStairs {
    public int minCostClimbingStairs(int[] cost) {
        int[] res = new int[cost.length];
        res[0] = cost[0];
        res[1] = cost[1];
        for(int i=2; i<cost.length; i++) {
            res[i] = Math.min(res[i-1], res[i-2]) + cost[i];
        }
        return Math.min(res[cost.length-2], res[cost.length-1]);
    }
}