// Given a string s, rearrange the characters of s so that any two adjacent characters are not the same.
// Return any possible rearrangement of s or return "" if not possible.
class ReorganizeString {
    public String reorganizeString(String s) {
        HashMap<Character, Integer> counts = new HashMap<>();
        for(char c : s.toCharArray()) {
            counts.put(c, counts.getOrDefault(c, 0) + 1);
        }
        PriorityQueue<Character> queue = new PriorityQueue<>((a, b) -> counts.get(b) - counts.get(a));
        queue.addAll(counts.keySet());
        StringBuilder result = new StringBuilder();
        while(queue.size()>1) {
            char curr = queue.remove();
            char next = queue.remove();
            result.append(curr);
            result.append(next);
            counts.put(curr, counts.get(curr)-1);
            counts.put(next, counts.get(next)-1);
            if(counts.get(curr) > 0) {
                queue.add(curr);
            }
            if(counts.get(next) > 0) {
                queue.add(next);
            }
        }
        while(!queue.isEmpty()) {
            char last = queue.remove();
            if(counts.get(last) > 1) {
                return "";
            }
            result.append(last);
        }
        return result.toString();
    }
}