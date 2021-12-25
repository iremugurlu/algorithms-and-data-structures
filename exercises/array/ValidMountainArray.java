// Given an array of integers arr, return true if and only if it is a valid mountain array.
// Recall that arr is a mountain array if: arr.length >= 3
public class ValidMountainArray {
    public boolean validMountainArray(int[] arr) {
        boolean inc = true;
        boolean dec = false;
        if(arr.length < 3) return false;
        // at the beginning of the mountain there should be an increase
        if(arr[1] <= arr[0]) return false;
        for(int i=1; i<arr.length; i++) {
            if(inc && arr[i] > arr[i-1]) {
                continue;
            } else if(inc && arr[i] < arr[i-1]) {
                inc = false;
                dec = true;
            } else if(dec && arr[i] < arr[i-1]) {
                continue;
            } else {
                return false;
            }
        }
        // if the mountain decreased at some point return true, else false
        if(dec) return true;
        else return false;
    }
}