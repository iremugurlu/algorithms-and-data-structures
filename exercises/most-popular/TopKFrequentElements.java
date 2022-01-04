// Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order.
public class TopKFrequentElements {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        PriorityQueue<Integer> queue = new PriorityQueue<>(new Comparator<Integer>() {
            public int compare(Integer n1, Integer n2) {
                return map.get(n2).compareTo(map.get(n1));
            }
        });
        for(int num : nums) {
            if(map.containsKey(num)) {
                map.put(num, map.get(num)+1);
            } else {
                map.put(num, 1);
            }
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