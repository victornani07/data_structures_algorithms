public class Solution {
    private final int size;
    private final int[][] matrix;

    public Solution(int size, int[][] matrix) {
        this.size = size;
        this.matrix = matrix;
    }

    public void rotate(int cycles) {
        if(cycles == size / 2)
            return;

        for (int i = cycles; i < size - cycles - 1; ++i) {
            int temp = matrix[cycles][i];
            matrix[cycles][i] = matrix[size - 1 - i][cycles];
            matrix[size - 1 - i][cycles] = matrix[size - 1 - cycles][size - 1 - i];
            matrix[size - 1 - cycles][size - 1 - i] = matrix[i][size - 1 - cycles];
            matrix[i][size - 1 - cycles] = temp;
        }

        this.rotate(++cycles);
    }

    public void print() {
        for(int i = 0; i < size; ++i) {
            for (int j = 0; j < size; ++j)
                System.out.print(matrix[i][j] + " ");
            System.out.println();
        }
    }
}
