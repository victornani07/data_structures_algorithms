public class Solution {
    public int searchInsert(int[] nums, int target) {
        int i = 0;
        while(nums[i] < target) {
            ++i;
            if(i == nums.length)
                break;
        }

        return i;
    }
}
