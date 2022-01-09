public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> freq = new HashMap<>();
        for(char c : s.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0)+1);
        }
        for(char c : t.toCharArray()) {
            if(freq.containsKey(c)) {
                if(freq.get(c) == 1) {
                    freq.remove(c);
                } else {
                    freq.put(c, freq.get(c)-1);   
                }
            } else {
                return false;
            }
        }
        if(freq.size() == 0) return true;
        return false;
    }
}
