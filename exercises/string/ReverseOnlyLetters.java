// Given a string s, reverse the string according to the following rules:
// - All the characters that are not English letters remain in the same position.
// - All the English letters (lowercase or uppercase) should be reversed.
// Return s after reversing it.
public class ReverseOnlyLetters {
    public String reverseOnlyLetters(String s) {
        char[] chars = s.toCharArray();
        int start = 0;
        int end = chars.length-1;
        while(start < end && start < chars.length && end >= 0) {
            while(start < end && !Character.isLetter(chars[start])) {
                start++;
            }
            while(start < end && !Character.isLetter(chars[end])) {
                end--;
            }
            if(start >= end) {
                break;
            }
            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;                
            start++;
            end--;
        }
        String res = "";
        for(char c : chars) {
            res += c;
        }
        return res;
    }
}