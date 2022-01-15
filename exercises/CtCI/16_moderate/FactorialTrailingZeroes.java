public class FactorialTrailingZeroes {
    public int trailingZeroes(int n) {
        // there are more 2's than 5's so count 5's
        int res = 0;
        int div = 5;
        while(div <= n) {
            res += count(div);
            div += 5;
        }
        return res;
    }
    
    public int count(int num) {
        int res = 0;
        while(num%5 == 0) {
            res++;
            num /= 5;
        }
        return res;
    }
}