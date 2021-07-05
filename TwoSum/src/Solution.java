import java.util.HashMap;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> numbers = new HashMap<Integer, Integer>();
        int n = nums.length;

        for(int i = 0; i < n; ++i)
            numbers.put(nums[i], i);

        for(int i = 0; i < n; ++i) {
            int sum = target - nums[i];

            try {
                int index = numbers.get(sum);
                if(index != i)
                    return new int[]{i, index};
            } catch (Exception e) {}
        }

        return new int[]{-1, -1};
    }
}
