// Given an array of integers nums, calculate the pivot index of this array.
// The pivot index is the index where the sum of all the numbers strictly to the left of the index is equal to the sum of all the numbers strictly to the index's right.
// If the index is on the left edge of the array, then the left sum is 0 because there are no elements to the left. This also applies to the right edge of the array.
// Return the leftmost pivot index. If no such index exists, return -1.
public class FindPivotIndex {
    public int pivotIndex(int[] nums) {
        if(nums == null || nums.length == 0) return -1;
        int left = 0;
        int right = 0;
        for(int i=0; i<nums.length; i++) {
            right += nums[i];
        } 
        int index = 0;
        while(index < nums.length) {
            if(index > 0) left += nums[index-1];
            right -= nums[index];
            if(left == right) {
                return index;
            }
            index++;
        }
        return -1;
    }
}