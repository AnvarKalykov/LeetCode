package medium;

/*
Given an m x n matrix, return all elements of the matrix in spiral order.
 */

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList();

        int rows = matrix.length;
        if (rows == 0) return list;

        int cols = matrix[0].length;

        int l = 0, r = cols - 1, t = 0, b = rows - 1, d = 0;

        while (l <= r && t <= b) {
            if (d == 0) {
                for (int i = l; i <= r; i++) {
                    list.add(matrix[t][i]);
                }

                d = 1;
                t++;

            } else if (d == 1) {
                for (int i = t; i <= b; i++) {
                    list.add(matrix[i][r]);
                }


                d = 2;
                r--;


            } else if (d == 2) {

                for (int i = r; i >= l; i--) {
                    list.add(matrix[b][i]);
                }

                d = 3;
                b--;


            } else if (d == 3) {

                for (int i = b; i >= t; i--) {
                    list.add(matrix[i][l]);
                }
                d = 0;
                l++;


            }


        }
        return list;

    }
}
