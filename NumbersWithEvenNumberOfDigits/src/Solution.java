public class Solution {
    private boolean hasEvenNumberOfDigits(int num) {
        if(num <= 9)
            return false;

        int counter = 0;

        while(num > 0) {
            num /= 10;
            ++counter;
        }

        return counter % 2 == 0;
    }

    public int findNumbers(int[] nums) {
        int counter = 0;

        for(int num : nums)
            if(hasEvenNumberOfDigits(num))
                ++counter;

        return counter;
    }
}
