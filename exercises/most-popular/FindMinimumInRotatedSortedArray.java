public class FindMinimumInRotatedSortedArray {

    // more efficient binary search solution
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while(left < right) {
            int mid = left + (right - left) / 2;
            if(nums[mid] < nums[right]) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return nums[left];
    }
    
    public int findMinOtherSolution(int[] nums) {
        int[] sorted = resort(nums);
        return sorted[0];
    }
    
    public int[] resort(int[] nums) {
        int n = nums.length;
        int[] sorted = new int[n];
        int index = 0;
        for(int i=0; i<n-1; i++) {
            if(nums[i+1] < nums[i]) {
                index = i+1;
                break;
            }
        }
        for(int i=0; i<n; i++) {
            sorted[i] = nums[(i+index)%n];
        }
        return sorted;
    }

}