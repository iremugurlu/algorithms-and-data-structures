// You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, 
// and two integers m and n, representing the number of elements in nums1 and nums2 respectively.
// Merge nums1 and nums2 into a single array sorted in non-decreasing order.
public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] res = new int[m+n];
        int index1 = 0;
        int index2 = 0;
        int index = 0;
        while(index1 < m && index2 < n) {
            if(nums1[index1] <= nums2[index2]) {
                res[index] = nums1[index1];
                index1++;
            } else {
                res[index] = nums2[index2];
                index2++;
            }
            index++;
        }
        while(index1 < m) {
            res[index] = nums1[index1];
            index++;
            index1++;
        }
        while(index2 < n) {
            res[index] = nums2[index2];
            index++;
            index2++;
        }
        for(int i=0; i<m+n; i++) {
            nums1[i] = res[i];
        }
    }
}