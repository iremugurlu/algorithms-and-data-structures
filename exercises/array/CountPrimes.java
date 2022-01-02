// Given an integer n, return the number of prime numbers that are strictly less than n.
public class CountPrimes {
    public int countPrimes(int n) {
        if(n < 2) return 0;
        int count = 0;
        // default values are set to false, so assumes all of them are prime
        boolean[] notPrime = new boolean[n+1];
        for(int i=2; i<n; i++) {
            if(!notPrime[i]) {
                count++;
                for(int j = 2; j*i < n; j++){
                    notPrime[i*j] = true; 
                }
            }
        }
        return count;
    }
}