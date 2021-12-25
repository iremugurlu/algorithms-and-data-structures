// Given a fixed-length integer array arr, duplicate each occurrence of zero, shifting the remaining elements to the right.
public class DuplicateZeros {
    public void duplicateZeros(int[] arr) {
        int index = 0;
        int pointer = 0;
        int[] updated = new int[arr.length];
        while(index < arr.length) {
            if(arr[pointer] == 0) {
                updated[index] = 0;
                index++;
                if(index >= arr.length) break;
                updated[index] = 0;
            } else {
                updated[index] = arr[pointer];
            }
            pointer++;
            index++;
        }
        for(int i=0; i<updated.length; i++) {
            arr[i] = updated[i];
        }
    }
}