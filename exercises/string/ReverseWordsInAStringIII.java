public class ReverseWordsInAStringIII {
    public String reverseWords(String s) {
        String[] split = s.split("\\s+");
    	s = "";
        for(int k=0; k<split.length-1; k++) {
            s += reverse(split[k]) + " ";
        }
        s += reverse(split[split.length-1]);
        return s;
    }
    
    public String reverse(String s) {
        String res = "";
        for(int i=s.length()-1; i>=0; i--) {
            res += s.charAt(i);
        }
        return res;
    }
}