// Given an array nums of n integers where nums[i] is in the range [1, n], 
// return an array of all the integers in the range [1, n] that do not appear in nums.
public class FindAllNumbersDisappearedInAnArray {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        for(int i=0; i<nums.length; i++) {
            while(nums[i] != i+1 && nums[nums[i]-1] != nums[i]) {
                int val = nums[i];
                nums[i] = nums[val-1];
                nums[val-1] = val;
            } 
        }
        List<Integer> res = new ArrayList<>();
        for(int i=0; i<nums.length; i++) {
            if(nums[i] != i+1) {
                res.add(i+1);
            }
        }
        return res;
    }
}