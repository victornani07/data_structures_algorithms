import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int majorityElement(int[] nums) {
        int maxElement = nums[0];
        Map<Integer, Integer> m = new HashMap<>();

        for(int num : nums)
            if(!m.containsKey(num))
                m.put(num, 1);
            else {
                int a = m.get(num) + 1;
                if(a > nums.length / 2)
                    return num;
                m.replace(num, a);
            }

        return maxElement;
    }
}
