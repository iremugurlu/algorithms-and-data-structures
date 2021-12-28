// The Fibonacci numbers, commonly denoted F(n) form a sequence, called the Fibonacci sequence, such that each number is the 
// sum of the two preceding ones, starting from 0 and 1. Given n, calculate F(n).
public class FibonacciNumber {
    public int fib(int n) {
        if(n == 0) return 0;
        if(n == 1) return 1;
        int[] fibs = new int[n+1];
        fibs[0] = 0;
        fibs[1] = 1;
        for(int i=2; i<=n; i++) {
            fibs[i] = fibs[i-1] + fibs[i-2];
        }
        return fibs[n];
    }
}
