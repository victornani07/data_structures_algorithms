import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> rows = new ArrayList<>(numRows);
        List<Integer> prev = new ArrayList<>();

        for(int i = 1; i <= numRows; ++i) {
            List<Integer> row = new ArrayList<>(i);
            for (int j = 0; j < i; ++j)
                if(j == 0 || j == i - 1)
                    row.add(1);
                else {
                    int number = prev.get(j - 1) + prev.get(j);
                    row.add(number);
                }
            rows.add(row);
            prev = row;
        }

        return rows;
    }
}
