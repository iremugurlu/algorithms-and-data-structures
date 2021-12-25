// You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. 
// The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.
public class PlusOne {
    public int[] plusOne(int[] digits) {
        int index = digits.length-1;
        while(index >= 0 && digits[index] == 9) {
            digits[index] = 0;
            index--;
        }
        if(index == -1) {
            int[] res = new int[digits.length+1];
            res[0] = 1;
            for(int i=0; i<digits.length; i++) {
                res[i+1] = digits[i];
            }
            return res;
        } else {
            digits[index] = digits[index] + 1;
            return digits;
        }
    }
}