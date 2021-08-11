public class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum = 0;
        int first = nums[0], firstIndex = 0;

        for(int i = 0; i < k; ++i)
            sum += nums[i];

        double maxAverage = sum / k, currentAverage;

        for(int i = k; i < nums.length; ++i) {
            sum = sum - first + nums[i];
            ++firstIndex;
            first = nums[firstIndex];
            currentAverage = sum / k;
            maxAverage = Math.max(maxAverage, currentAverage);
        }

        return maxAverage;
    }
}
