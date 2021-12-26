public class ReverseWordsInAString {
    public String reverseWords(String s) {
        String[] split = s.trim().split("\\s+");
        int i = 0;
        int j = split.length-1;
        while(i < j) {
            String tmp = split[i];
            split[i] = split[j];
            split[j] = tmp;
            i++;
            j--;
        }
    	s = "";
        for(int k=0; k<split.length-1; k++) {
            s += split[k] + " ";
        }
        s += split[split.length-1];
        return s;
    }
}