import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int numRows = 6;

        List<List<Integer>> pascal = solution.generate(numRows);

        for(List<Integer> list : pascal) {
            for (Integer num : list)
                System.out.print(num + " ");
            System.out.println();
        }

    }
}
