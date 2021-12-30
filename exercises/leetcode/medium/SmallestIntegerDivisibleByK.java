// Given a positive integer k, you need to find the length of the smallest positive integer n such that n is divisible by k, and n only contains the digit 1.
// Return the length of n. If there is no such n, return -1.
public class SmallestIntegerDivisibleByK {
    public int smallestRepunitDivByK(int k) {
        if(k % 2 == 0 || k % 5 == 0) {
            return -1;
        } else {
            long n = 0;
            for(int i=1; i<=k; i++) {
                n = (n*10 + 1) % k;
                if(n == 0) return i;
            }
            return -1;
        }
    }
}