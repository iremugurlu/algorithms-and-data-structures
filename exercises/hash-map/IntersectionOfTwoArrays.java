import java.util.*;

// Given two integer arrays nums1 and nums2, return an array of their intersection. 
// Each element in the result must appear as many times as it shows in both arrays and you may return the result in any order.
public class IntersectionOfTwoArrays {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> res = new ArrayList<>();
        
        for(int num : nums1) {
            if(map.containsKey(num)) {
                map.put(num, map.get(num)+1);
            } else {
                map.put(num, 1);
            }
        }
        
        for(int num : nums2) {
            if(map.containsKey(num)) {
                map.put(num, map.get(num)-1);
                res.add(num);
                if(map.get(num) == 0) map.remove(num);
            }            
        }
        int[] result = new int[res.size()];
        for(int i=0; i<res.size(); i++) {
            result[i] = res.get(i);
        }
        
        return result;
    }
}