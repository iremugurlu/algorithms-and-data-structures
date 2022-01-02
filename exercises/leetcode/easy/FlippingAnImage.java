// Given an n x n binary matrix image, flip the image horizontally, then invert it, and return the resulting image.
// To flip an image horizontally means that each row of the image is reversed.
// To invert an image means that each 0 is replaced by 1, and each 1 is replaced by 0.
public class FlippingAnImage {
    public int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;
        for(int i=0; i<n; i++) {
            int start = 0;
            int end = n-1;
            while(start < end) {
                int first = image[i][start];
                int second = image[i][end];
                image[i][end] = 1-first;
                image[i][start] = 1 - second;
                start++;
                end--;
            }
            if(start == end) {
                image[i][start] = 1 - image[i][start];
            }
        }
        return image;
    }
}