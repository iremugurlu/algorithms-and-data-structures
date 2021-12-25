// Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int index = 0;
        int curr = 0;
        while(index < nums.length) {
            if(nums[index] == 0) {
                index++;
            } else {
                nums[curr] = nums[index];
                curr++;
                index++;
            }
        }
        while(curr < index) {
            nums[curr] = 0;
            curr++;
        }
    }
}