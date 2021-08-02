public class NumArray {
    private int[] nums;

    public NumArray(int[] nums) {
        this.nums = nums;
    }

    public int sumRange(int left, int right) {
        int sum = 0;

        while(left <= right) {
            if(left == right)
                sum += nums[left];
            else
                sum += nums[left] + nums[right];
            ++left;
            --right;
        }

        return sum;
    }
}
