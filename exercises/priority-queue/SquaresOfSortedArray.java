// Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.
public class SquaresOfSortedArray {
    public int[] sortedSquares(int[] nums) {
        PriorityQueue<Integer> squared = new PriorityQueue<Integer>();
        for(int num : nums) {
            squared.add(num*num);
        }
        int[] res = new int[nums.length];
        for(int i=0; i<nums.length; i++) {
            res[i] = squared.poll();
        }
        return res;
    }
}