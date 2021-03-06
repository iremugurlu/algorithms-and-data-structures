// Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The relative order of the elements may be changed.
public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int last = 0;
        for(int i=0; i<nums.length; i++) {
            if(nums[i] != val) {
                nums[last] = nums[i];
                last++;
            }
        }
        return last;
    }
}