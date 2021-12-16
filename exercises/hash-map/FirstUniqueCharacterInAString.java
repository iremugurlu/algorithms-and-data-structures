class FirstUniqueCharacterInAString {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        List<Character> nonRepeating = new ArrayList<>();
        for(int i=0; i<s.length(); i++) {
            if(map.containsKey(s.charAt(i))) {
                if(nonRepeating.contains(s.charAt(i))) {
                    nonRepeating.remove((Character)s.charAt(i));
                }
            } else {
                map.put(s.charAt(i), i);
                nonRepeating.add(s.charAt(i));
            }
        }
        if(nonRepeating.size() == 0) return -1;
        else return map.get(nonRepeating.get(0));
    }
}