public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[][] mat = new int[][]{{1,2},{3,4}};
        int r = 1, c = 4;

        int[][] newMat = solution.matrixReshape(mat, r, c);

        for(int i = 0; i < newMat.length; ++i) {
            for (int j = 0; j < newMat[0].length; ++j)
                System.out.print(newMat[i][j] + " ");
            System.out.println();
        }
    }
}
