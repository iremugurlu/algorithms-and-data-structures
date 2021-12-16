public class HappyNumber {
    public boolean isHappy(int n) {
        Set<Integer> visited = new HashSet<>();
        while(true) {
            int sum = sum(n);
            if(sum == 1) return true;
            if(visited.contains(sum)) return false;
            visited.add(sum);
            n = sum;
        }
    }
    
    public int sum(int n) {
        int total = 0;
        while(n>0) {
            int rest = n%10;
            n = n/10;
            total += rest * rest;
        }
        return total;
    }
}