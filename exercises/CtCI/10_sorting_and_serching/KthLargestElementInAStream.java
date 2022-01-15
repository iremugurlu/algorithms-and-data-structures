import java.util.*;

public class KthLargestElementInAStream {

    PriorityQueue<Integer> stream;
    int size;
    
    public KthLargestElementInAStream(int k, int[] nums) {
        stream = new PriorityQueue<>();
        size = k;
        for(int num : nums) {
            add(num);
        }
    }
    
    public int add(int val) {
        if(stream.size() < size) {
            stream.add(val);
        } else {
            if(stream.peek() < val) {
                stream.poll();
                stream.add(val);
            }
        }
        return stream.peek();
    }
}

/**
 * Your KthLargestElementInAStream object will be instantiated and called as such:
 * KthLargestElementInAStream obj = new KthLargestElementInAStream(k, nums);
 * int param_1 = obj.add(val);
 */