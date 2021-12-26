// Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. 
// The relative order of the elements should be kept the same.
public class RemoveDuplicatesFromSortedArray {
    // in-place solution
    public int removeDuplicates(int[] nums) {
        int last = 0;
        int prev = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++) {
            if(nums[i] != prev) {
                nums[last] = nums[i];
                last++;
                prev = nums[i];
            }
        }
        return last;
    }

    // solution using set
    public int removeDuplicatesNotInPlace(int[] nums) {
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