// Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int[] res = new int[2];
        for(int i=0; i<nums.length; i++) {
            if(map.containsKey(target - nums[i])) {
                res[0] = map.get(target-nums[i]);
                res[1] = i;
                return res;
            } else {
                map.put(nums[i], i);
            }
        }
        return res;
    }
}