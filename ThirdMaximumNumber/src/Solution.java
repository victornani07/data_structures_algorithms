import java.util.Set;
import java.util.TreeSet;

public class Solution {
    public int thirdMax(int[] nums) {
        Set<Integer> s = new TreeSet<>();

        for(int n : nums)
            s.add(n);

        Integer[] newNums = new Integer[s.size()];
        s.toArray(newNums);

        if(newNums.length < 3) return newNums[newNums.length - 1];
        else return newNums[newNums.length - 3];
    }
}
