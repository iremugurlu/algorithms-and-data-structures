import java.util.*;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> anagrams = new HashMap<>();
        for(String str : strs) {
            char[] array = str.toCharArray();
            Arrays.sort(array);
            String sorted = new String(array);
            if(anagrams.containsKey(sorted)) {
                List<String> words = anagrams.get(sorted);
                words.add(str);
                anagrams.put(sorted, words);
            } else {
                List<String> words = new ArrayList<>();
                words.add(str);
                anagrams.put(sorted, words);
            }
        }
        List<List<String>> res = new ArrayList<>();
        for(String key : anagrams.keySet()) {
            res.add(anagrams.get(key));
        }
        return res;
    }
}