public class Solution {
    public int reverseBits(int n) {
        int reversed = 0, pos = 0;

        while(n != 0) {
            int digit = n & 1;
            n = n >> 1;
            reversed = reversed | (digit << (31 - pos));
        }

        return reversed;
    }
}
