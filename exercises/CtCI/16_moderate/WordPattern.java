public class WordPattern {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        char[] patterns = pattern.toCharArray();
        if(words.length != patterns.length) return false;
        HashMap<Character, String> map = new HashMap<>();
        for(int i=0; i<patterns.length; i++) {
            if(!map.containsKey(patterns[i])) {
                if(map.values().contains(words[i])) return false;
                map.put(patterns[i], words[i]);
            } else {
                if(!map.get(patterns[i]).equals(words[i])) return false;
            }
        }
        return true;
    }
}