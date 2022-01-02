// Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
// Notice that the solution set must not contain duplicate triplets.
public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for(int i=0; i<nums.length-2; i++) {
            if(i == 0 || (i>0 && nums[i] != nums[i-1])) {
                int left = i+1;
                int right = nums.length-1;
                while(left < right) {
                    int sum = nums[i] + nums[left] + nums[right];
                    if(sum == 0) {
                        res.add(Arrays.asList(nums[i], nums[left], nums[right]));
                        while(left < right && left<nums.length-1 && nums[left] == nums[left+1]) left++;
                        while(left < right && right<nums.length-1 && nums[right] == nums[right+1]) right--;
                        left++;
                        right--;
                    } else if(sum > 0) {
                        right--;
                    } else {
                        left++;
                    }
                }
            }
        }
        return res;
    }

}