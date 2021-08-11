import java.util.Arrays;

public class Solution {
    public int findLHS(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length, countHar = 1, maxCount = 0, i = 0, countZero = 0;

        if(nums[0] == nums[n - 1])
            return 0;

        while(i < n - 1) {
            int k = i, l = i;
            for(int j = i + 1; j < n; ++j) {
                int diff = nums[j] - nums[k];
                if(diff == 0) {
                    ++l;
                    ++countHar;
                    ++countZero;
                }
                else if(diff == 1)
                    ++countHar;
                else
                    break;
            }
            if(countHar != 1 && countHar != countZero + 1)
                maxCount = Math.max(countHar, maxCount);
            countHar = 1;
            countZero = 0;
            i = l + 1;
        }

        return maxCount;
    }
}
