/*
 INPUT:         OUTPUT:
    9 9 8 1
    5 6 2 6      9  9
    8 2 6 4      8  6
    6 2 2 2


Input: grid = [[9,9,8,1],[5,6,2,6],[8,2,6,4],[6,2,2,2]]
Output: [[9,9],[8,6]]
Explanation: The diagram above shows the original matrix and the generated matrix.
Notice that each value in the generated matrix corresponds to the largest value of a contiguous 3 x 3 matrix in grid.
 */

package arrays;

public class LargestValInMatrix {
    public int[][] largestLocal(int[][] grid) {
        int len = grid.length;
        int maxSize = len-2;
        int[][] maxLocal= new int[maxSize][maxSize];
        for(int i=0;i<maxSize;i++){
            for(int j=0;j<maxSize;j++){
                maxLocal[i][j] = countMax(grid,i,j);
            }
        }
        return maxLocal;
    }

    public int countMax(int[][] grid,int i, int j){
        int max = 1;
        for(int m=i; m<i+3;m++){
            for(int n=j; n<j+3;n++){
                max = Math.max(max,grid[m][n]);
                  /*  if(grid[m][n]>max)
                        max = grid[m][n];*/
            }
        }
        return max;
    }

}
