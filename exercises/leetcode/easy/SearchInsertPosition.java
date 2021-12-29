// Given a sorted array of distinct integers and a target value, return the index if the target is found. 
// If not, return the index where it would be if it were inserted in order.
public class SearchInserPosition {

    public int searchInsert(int[] nums, int target) {
        return binarySearch(nums, target, 0, nums.length-1);
    }
    
    public int binarySearch(int[] nums, int target, int left, int right) {
        if(left <= right) {
            int mid = left + (right-left)/2;
            if(nums[mid] == target) {
                return mid;
            } else if(nums[mid] < target) {
                if(mid < nums.length-1) {
                    if(nums[mid+1] >= target) {
                        return mid+1;
                    } else {
                        return binarySearch(nums, target, mid+2, right);
                    }
                } else {
                    return nums.length;
                }
            } else {
                if(mid > 0) {
                    if(nums[mid-1] < target) {
                        return mid;
                    } else if(nums[mid-1] == target) {
                        return mid-1;
                    } else {
                        return binarySearch(nums, target, left, mid-2);
                    }
                } else {
                    return 0;
                }
            }
        }
        return left;
    }
}