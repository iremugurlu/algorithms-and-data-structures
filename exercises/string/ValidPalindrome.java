// A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, 
// it reads the same forward and backward. Alphanumeric characters include letters and numbers.
// Given a string s, return true if it is a palindrome, or false otherwise.
public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length()-1;
        while(left < right) {
            while(left < s.length() && !(Character.isLetter(s.charAt(left)) || Character.isDigit(s.charAt(left)))) {
                left++;
            }
            while(right >= 0 && !(Character.isLetter(s.charAt(right)) || Character.isDigit(s.charAt(right)))) {
                right--;
            }
            if(left < s.length() && right >= 0 && Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}