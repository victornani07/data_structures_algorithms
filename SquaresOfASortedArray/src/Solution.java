public class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] squaredNums = new int[nums.length];
        int inserted = 0;

        for(int i = 0; i < nums.length; ++i) {
            int squared = nums[i] * nums[i];
            if(inserted == 0)
                squaredNums[0] = squared;
            else if(squared < nums[0]) {

            }
        }
    }
}
