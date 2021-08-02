public class Solution {
    public void moveZeroes(int[] nums) {
        int pos = nums.length - 1;
        for(int i = 0; i < pos; ++i) {
            if(nums[i] == 0) {
                for (int j = i; j < pos - 1; ++j)
                    nums[j] = nums[j + 1];
                nums[nums.length] = 0;
                --pos;
                --i;
            }
        }
    }
}
