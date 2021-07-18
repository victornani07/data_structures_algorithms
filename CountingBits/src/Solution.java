public class Solution {
    public int[] countBits(int n) {
        int[] setBits = new int[n + 1];

        setBits[0] = 0;

        if(n == 0)
            return setBits;

        setBits[1] = 1;

        if(n == 1)
            return setBits;

        setBits[2] = 1;

        if(n == 2)
            return setBits;

        int dec = 2;

        for(int i = 3; i <= n; ++i) {
            if(i == dec * 2)
                dec *= 2;

            setBits[i] = setBits[i - dec] + 1;
        }

        return setBits;
    }
}
