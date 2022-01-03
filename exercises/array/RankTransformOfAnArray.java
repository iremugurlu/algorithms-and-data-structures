// Given an array of integers arr, replace each element with its rank.
// The rank represents how large the element is. The rank has the following rules:
// - Rank is an integer starting from 1.
// - The larger the element, the larger the rank. If two elements are equal, their rank must be the same.
// - Rank should be as small as possible.
public class RankTransformOfAnArray {
    public int[] arrayRankTransform(int[] arr) {
        int[] res = arr.clone();
        Arrays.sort(arr);
        HashMap<Integer, Integer> ranks = new HashMap<>();
        int index = 1;
        for(int i=0; i<arr.length; i++) {
            if(!ranks.containsKey(arr[i])) {
                ranks.put(arr[i], index);   
                index++;
            }
        }
        for(int i=0; i<arr.length; i++) {
            res[i] = ranks.get(res[i]);
        }
        return res;
    }
}