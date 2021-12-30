public class ThreeSumClosest {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closest = nums[0] + nums[1] + nums[nums.length-1];
        for(int i=0; i<nums.length-2; i++) {
            int sum = twoSumClosest(nums, target-nums[i], i+1, nums.length-1) + nums[i];
            if(sum == target) {
                return sum;
            }
            if(Math.abs(sum-target) < Math.abs(closest-target)) {
                closest = sum;
            }
        }
        return closest; 
    }
    
    public int twoSumClosest(int[] nums, int target, int start, int end) {
        int closest = nums[start] + nums[end];
        while(start < end) {
            int sum = nums[start] + nums[end];
            if(sum == target) {
                return sum;
            }
            if(Math.abs(sum-target) < Math.abs(closest-target)) {
                closest = sum;
            }
            if(sum < target) {
                start++;
            } else {
                end--;
            }
        }
        return closest;
    }
}