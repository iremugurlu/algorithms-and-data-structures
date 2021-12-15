public class BinarySearch {

    public static boolean binarySearchRecursive(int[] array, int target) {
        return binarySearchRecursive(array, target, 0, array.length-1);
    }

    public static boolean binarySearchRecursive(int[] array, int target, int left, int right) {
        if(left > right) {
            return false;
        }
        int mid = left + (right-left)/2;
        if(array[mid] == target) {
            return true;
        } else if(target < array[mid]) {
            return binarySearchRecursive(array, target, left, mid-1);
        } else {
            return binarySearchRecursive(array, target, mid+1, right);
        }
    }

    public static boolean binarySearchIterative(int[] array, int target) {
        int left = 0;
        int right = array.length-1;
        while(left <= right) {
            int mid = left + (right-left)/2;
            if(array[mid] == target) {
                return true;
            } else if(target < array[mid]) {
                right = mid-1;
            } else {
                left = mid+1;
            }
        }
        return false;
    }

}
