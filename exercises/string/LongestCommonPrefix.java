// Write a function to find the longest common prefix string amongst an array of strings.
// If there is no common prefix, return an empty string "".
public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0) return "";
        if(strs.length == 1) return strs[0];
        int index = 0;
        String res = "";
        boolean same = true;
        while(index < strs[0].length() && same) {
            for(int i=1; i<strs.length; i++) {
                if(strs[i].length() > index) {
                    if(strs[i].charAt(index) != strs[0].charAt(index)) {
                        same = false;
                    }
                } else {
                    same = false;
                }
                
            }
            if(same) res += strs[0].charAt(index);
            index++;
        }
        return res;
    }
}