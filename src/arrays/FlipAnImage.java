/*
Input: image = [[1,1,0],[1,0,1],[0,0,0]]
Output: [[1,0,0],[0,1,0],[1,1,1]]
Explanation: First reverse each row: [[0,1,1],[1,0,1],[0,0,0]].
Then, invert the image: [[1,0,0],[0,1,0],[1,1,1]]
 */
package arrays;

public class FlipAnImage {
    public int[][] flipAndInvertImage(int[][] image) {
        int len = image.length;
        for(int[] a: image){
            int i=0;
            int j = len-1;
            while(i<j && i<len/2){
                int temp = 0;
                temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                i++;
                j--;
            }
        }

        for(int i=0; i<len; i++){
            for(int j=0; j<len; j++){
                if(image[i][j] == 0)
                    image[i][j] = 1;
                else
                    image[i][j] = 0;
            }
        }
        return image;
    }
}
