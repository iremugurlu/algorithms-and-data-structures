// Given an array of characters chars, compress it using the following algorithm:
// Begin with an empty string s. For each group of consecutive repeating characters in chars:
// If the group's length is 1, append the character to s.
// Otherwise, append the character followed by the group's length.
// The compressed string s should not be returned separately, but instead, be stored in the input character array chars. Note that group lengths that are 10 or longer will be split into multiple characters in chars.
// After you are done modifying the input array, return the new length of the array.
// You must write an algorithm that uses only constant extra space.
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