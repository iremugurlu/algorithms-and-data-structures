// Given an integer x, return true if x is palindrome integer.
public class PalindromeNumber {

    public boolean isPalindrome(int x) {
        if(x == 0) {
            return true;
        }
        if(x < 0) {
            return false;
        }
        int reversed = reverse(x);
        return x == reversed;
    }
    
    public int reverse(int x) {
        int reversed = 0;
        while(x > 0) {
            reversed = reversed*10 + x%10;
            x = x/10;
        }
        return reversed;
    }

    // solution by converting so string
    public boolean isPalindromeWithConvertingToString(int x) {
        String input = x + "";
        if(input.length() == 0 || input.length() == 1) {
            return true;
        }
        int left = 0;
        int right = input.length()-1;
        while(left < right) {
            if(input.charAt(left) == input.charAt(right)) {
                left++;
                right--;
            } else {
                return false;
            }
        }
        return true;
    }
}
