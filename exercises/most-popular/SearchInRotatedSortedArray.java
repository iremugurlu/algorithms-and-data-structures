class SearchInRotatedSortedArray {
    
    int index;
    
    public int search(int[] nums, int target) {
        int[] sorted = resort(nums);
        int res = binarySearch(sorted, 0, nums.length-1, target);
        if(res == -1) return -1;
        if(res < (nums.length - index)) {
            return res+index;
        } else {
            return res-(nums.length - index);
        }
    }
    
    public int[] resort(int[] nums) {
        int n = nums.length;
        int[] sorted = new int[n];
        index = 0;
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
    
    public int binarySearch(int[] nums, int l, int r, int target) {
        if(l <= r) {
            int m = r + (l-r)/2;
            if(nums[m] == target) {
                return m;
            } else if (nums[m] > target) {
                return binarySearch(nums, l, m-1, target);
            } else {
                return binarySearch(nums, m+1, r, target);
            }
        }
        
        return -1;
    }
}