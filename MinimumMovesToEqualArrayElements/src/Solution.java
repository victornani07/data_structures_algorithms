public class Solution {
    public int minMoves(int[] nums) {
        int min = Integer.MAX_VALUE, sum = 0;

        for(int num : nums) {
            if(num < min)
                min = num;
            sum += num;
        }

        return sum - (nums.length * min);
    }
}
