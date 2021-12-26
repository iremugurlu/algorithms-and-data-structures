// Implement strStr().
// Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
class ImplementstrStr {
    public int strStr(String haystack, String needle) {
        if(needle.equals("")) return 0;
        for(int i=0; i<=haystack.length()-needle.length(); i++) {
            String sub = haystack.substring(i, i + needle.length());
            if(sub.equals(needle)) return i;
        }
        return -1;
    }
}