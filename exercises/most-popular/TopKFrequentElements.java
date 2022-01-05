// Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order.
public class TopKFrequentElements {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        PriorityQueue<Integer> queue = new PriorityQueue<>((a, b) -> Integer.compare(map.get(b), map.get(a)));
        for(int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for(int key : map.keySet()) {
            queue.add(key);
        }
        int[] res = new int[k];
        for(int i=0; i<k; i++) {
            res[i] = queue.poll();
        }
        return res;
    }
}
