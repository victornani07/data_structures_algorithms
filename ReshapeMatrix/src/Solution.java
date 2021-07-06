public class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int rows = mat.length;
        int columns = mat[0].length;
        int size = rows * columns;

        if (r * c != size)
            return mat;

        int[][] newMat = new int[r][c];
        int i1 = 0, j1 = 0;

        for(int i = 0; i < rows; ++i)
            for(int j = 0; j < columns; ++j) {
                newMat[i1][j1] = mat[i][j];
                ++j1;
                if(j1 == c) {
                    j1 = 0;
                    ++i1;
                }
            }

        return newMat;
    }
}
