import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> ranges = new ArrayList<>();
        int i = 0;

        while(i < nums.length) {
            int start = nums[i];
            int end = start;
            ++i;

            while(i < nums.length && end == nums[i] - 1) {
                ++end;
                ++i;
            }

            if(start == end)
                ranges.add(Integer.toString(start));
            else
                ranges.add(start + "->" + end);
        }

        return ranges;
    }
}
