// Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
public class ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int[] copy = nums.clone();
        int product = 1;
        for(int num : nums) {
            product *= num;
        }
        for(int i=0; i<nums.length; i++) {
            if(nums[i] != 0) {
                nums[i] = product / nums[i];         
            } else {
                nums[i] = getProduct(copy, i);
            }
        }
        return nums;
    }
    
    public int getProduct(int[] nums, int n) {
        int product = 1;
        for(int i=0; i<nums.length; i++) {
            if(i != n) product *= nums[i];
        }
        return product;
    }
}