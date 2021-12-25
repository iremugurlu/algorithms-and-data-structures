// Given a binary array nums, return the maximum number of consecutive 1's in the array.
class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int curr = 0;
        for(int num : nums) {
            if(num == 1) {
                curr++;
            } else {
                curr = 0;
            }
            max = Math.max(max, curr);
        }
        return max;
    }
}