// Given an array arr of integers, check if there exists two integers N and M such that N is the double of M ( i.e. N = 2 * M).
public class CheckIfNAndItsDoubleExist {
    public boolean checkIfExist(int[] arr) {
        Set<Integer> existing = new HashSet<>();
        for(int num : arr) {
            if(existing.contains(num*2)) return true;
            else if(num%2 == 0 && existing.contains(num/2)) return true;
            else existing.add(num);
        }
        return false;
    }
}