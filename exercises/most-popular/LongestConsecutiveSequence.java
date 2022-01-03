// Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.
// You must write an algorithm that runs in O(n) time.
public class LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        Set<Integer> set = new HashSet<>();
        int max = 0;
        for(int num : nums) {
            set.add(num);
        }
        for(int num : nums) {
            int left = num - 1;
            int right = num + 1;
            while(set.remove(left)) left--;
            while(set.remove(right)) right++;
            max = Math.max(max, right - left - 1);
            if(set.isEmpty()) return max;
        }
        return max;
    }
}