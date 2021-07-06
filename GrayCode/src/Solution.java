import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> grayCode(int n) {
        List<Integer> list = new ArrayList<>((int)Math.pow(2, n));

        list.add(0);
        list.add(1);
        int adder = 2;

        for(int i = 2; i <= n; ++i) {
            for(int j = list.size() - 1; j >= 0; --j) {
                int number = list.get(j) + adder;
                list.add(number);
            }

            adder *= 2;
        }

        return list;
    }
}
