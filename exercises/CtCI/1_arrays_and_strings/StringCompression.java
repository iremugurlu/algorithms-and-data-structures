public class StringCompression {
    public int compress(char[] chars) {
        int index=0;
        int i=0;
        while(i < chars.length) {
            int j=i;
            while(j<chars.length && chars[i] == chars[j]) {
                j++;
            }
            
            chars[index] = chars[i];
            index++;
            
            if(j-i > 1) {
                String count = j - i + "";
                for(char c : count.toCharArray()) {
                    chars[index] = c;
                    index++;
                }
            }
            i=j;
        }
        
        return index;
    }
}
