public class Solution {
    public int maxSubArray(int[] nums) {
        int maxSoFar = Integer.MIN_VALUE, maxEndingHere = 0;

        for (int num : nums) {
            maxEndingHere += num;
            if (maxSoFar < maxEndingHere)
                maxSoFar = maxEndingHere;
            if (maxEndingHere < 0)
                maxEndingHere = 0;
        }

        return maxSoFar;
    }
}
