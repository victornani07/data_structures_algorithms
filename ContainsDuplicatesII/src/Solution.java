import java.util.HashMap;
import java.util.Map;

public class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> visited = new HashMap<>();

        for(int i = 0; i < nums.length; ++i) {
            if(visited.containsKey(nums[i]))
                if(i - visited.get(nums[i]) <= k)
                    return true;
            visited.put(nums[i], i);
        }

        return false;
    }
}
