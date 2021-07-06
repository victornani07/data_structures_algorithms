import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        List<Integer> list = solution.grayCode(3);

        for(int i : list)
            System.out.println(i);
    }
}
