// Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int index = 0;
        int newIndex = 0;
        while(index < nums.length) {
            if(nums[index] != 0) {
                nums[newIndex] = nums[index];
                newIndex++;
            }
            index++;
        }
        while(newIndex < index) {
            nums[newIndex] = 0;
            newIndex++;
        }
    }
}