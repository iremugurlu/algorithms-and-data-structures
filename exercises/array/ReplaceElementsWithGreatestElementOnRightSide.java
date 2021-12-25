// Given an array arr, replace every element in that array with the greatest element among the elements to its right, and replace the last element with -1.
public class ReplaceElementsWithGreatestElementOnRightSide {
    public int[] replaceElements(int[] arr) {
        int max = -1;
        for(int i=arr.length-1; i>=0; i--) {
            int val = arr[i];
            arr[i] = max;
            max = Math.max(max, val);
        }
        return arr;
    }
}