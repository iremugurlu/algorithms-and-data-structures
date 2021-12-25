// Given an integer array nums, return the third distinct maximum number in this array. If the third maximum does not exist, return the maximum number.
public class ThirdMaximumNumber {
    public int thirdMax(int[] nums) {
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;
        Set<Integer> existing = new HashSet<>();
        for(int num : nums) {
            if(existing.contains(num)) {
                continue;
            }
            existing.add(num);
            if(num > max1) {
                max3 = max2;
                max2 = max1;
                max1 = num;
            } else if(num > max2 && num != max1) {
                max3 = max2;
                max2 = num;
            } else if(num > max3 && num != max1 && num != max2){
                max3 = num;
            } 
        }
        if(existing.size() >= 3) return max3;
        else return max1;
    }
}