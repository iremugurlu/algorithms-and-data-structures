// You are given an integer array nums where the largest integer is unique.
// Determine whether the largest element in the array is at least twice as much as every other number in the array. 
// If it is, return the index of the largest element, or return -1 otherwise.
public class LargestNumberAtLeastTwiceOfOthers {
    public int dominantIndex(int[] nums) {
        int expected = Integer.MIN_VALUE;
        int max = Integer.MIN_VALUE;
        int max_index = 0;
        for(int i=0; i<nums.length; i++) {
            if(nums[i] > max) {
                if(max != Integer.MIN_VALUE) {
                    expected = Math.max(expected, max*2);
                } 
                max = nums[i];
                max_index = i;
            } else {
                expected = Math.max(expected, nums[i]*2);
            } 
        }
        if(max >= expected) return max_index;
        else return -1;
    }
}