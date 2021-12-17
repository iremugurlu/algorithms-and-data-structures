import java.util.*;

// Given an array of strings strs, group the anagrams together. You can return the answer in any order.
// An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<Integer>> map = new HashMap<>();
        List<List<String>> res = new ArrayList<>();
        for(int i=0; i<strs.length; i++) {
            String str = sortString(strs[i]);
            if(map.containsKey(str)) {
                List<Integer> indices = map.get(str);
                indices.add(i);
                map.put(str, indices);
            } else {
                List<Integer> indices = new ArrayList<>();
                indices.add(i);
                map.put(str, indices);
            }
        }
        
        for(String key : map.keySet()) {
            List<String> list = new ArrayList<>();
            for(int i : map.get(key)) {
                list.add(strs[i]);
            }
            res.add(list);
        }
        
        return res;
    }
    
    public String sortString(String str) {
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        return String.valueOf(chars);
    }
}
