// Given an array nums of integers, return how many of them contain an even number of digits.
public class EvenNumberOfDigits {
    public int findNumbers(int[] nums) {
        int evenDigits = 0;
        for(int num : nums) {
            if(getNumberOfDigits(num) % 2 == 0) evenDigits++;
        }
        return evenDigits;
    }
    
    public int getNumberOfDigits(int num) {
        int count = 1;
        while(num > 9) {
            num = num/10;
            count++;
        }
        return count;
    }
}