// You are given an integer array nums. You are initially positioned at the array's first index, and each element in the array represents your maximum jump length at that position.
// Return true if you can reach the last index, or false otherwise.
public class JumpGame {
    public boolean canJump(int[] nums) {
        int max = 0;
        for(int i=0; i<nums.length; i++) {
            // cannot reach this step
            if(max < i) return false;
            max = Math.max(max, i+nums[i]);
        }
        return true;
    }
}