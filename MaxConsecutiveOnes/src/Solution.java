public class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        if(nums.length == 1 && nums[0] == 1) return 1;
        else if(nums.length == 1 && nums[0] == 0) return 0;

        int max = 0;

        for(int i = 0; i < nums.length; ++i)
            if (nums[i] == 1) {
                int j = i + 1;
                while(j < nums.length && nums[j] == 1)
                    ++j;
                max = Math.max(max, j - i);
                i = j;
            }

        return max;
    }
}
