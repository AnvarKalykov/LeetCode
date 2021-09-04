package medium;

/*
You are given an n x n 2D matrix representing an image, rotate the image by 90 degrees (clockwise).

You have to rotate the image in-place, which means you have to modify the input 2D matrix directly. DO NOT allocate another 2D matrix and do the rotation.
 */


public class RotateImage {
    public void rotate(int[][] matrix) {
        int N = matrix.length;
        // 1 - Transpose the matrix first
        for(int i = 0; i < N; i++){
            for(int j = i; j < N; j++){
                int temp = 0;
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        //2 -Now just Reverse from the both end
        for(int i = 0 ; i < N; i++){
            for(int j = 0; j < N / 2; j++){
                int temp = 0;
                temp = matrix[i][j];
                matrix[i][j] = matrix[i][N-1-j];
                matrix[i][N-1-j] = temp;
            }
        }
    }
}
