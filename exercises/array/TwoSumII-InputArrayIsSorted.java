// Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order, 
// find two numbers such that they add up to a specific target number. Let these two numbers be numbers[index1] and numbers[index2] where 
// 1 <= index1 < index2 <= numbers.length. Return the indices of the two numbers, index1 and index2, added by one as an integer array [index1, index2] of length 2.
public class TwoSumIIInputArrayIsSorted {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> existing = new HashMap<>();
        for(int i=0; i<numbers.length; i++) {
            if(existing.containsKey(target - numbers[i])) {
                int[] res = {existing.get(target-numbers[i]), i+1};
                return res;
            } else {
                existing.put(numbers[i], i+1);
            }
        }
        return new int[2];
    }
}