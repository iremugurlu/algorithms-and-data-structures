// Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. 
// The relative order of the elements should be kept the same.
public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        int last = 0;
        Set<Integer> existing = new HashSet<>();
        for(int i=0; i<nums.length; i++) {
            if(!existing.contains(nums[i])) {
                nums[last] = nums[i];
                existing.add(nums[i]);
                last++;
            }
        }
        return last;
    }
}