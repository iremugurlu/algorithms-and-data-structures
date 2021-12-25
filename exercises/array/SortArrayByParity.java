// Given an integer array nums, move all the even integers at the beginning of the array followed by all the odd integers.
public class SortArrayByParity {
    public int[] sortArrayByParity(int[] nums) {
        List<Integer> odds = new ArrayList<>();
        int curr = 0;
        int index = 0;
        while(index < nums.length) {
            if(nums[index] %2 == 0) {
                nums[curr] = nums[index];
                curr++;
                index++;
            } else {
                odds.add(nums[index]);
                index++;
            }
        }
        for(int i=0; i<odds.size(); i++) {
            nums[curr] = odds.get(i);
            curr++;
        }
        return nums;
    }
}