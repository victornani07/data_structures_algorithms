public class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sumFrom0ToN = (n * (n + 1)) / 2;
        int arraySum = 0;

        for(int num : nums)
            arraySum += num;

        return sumFrom0ToN - arraySum;
    }
}
