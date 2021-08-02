public class Solution {
    public int longestPalindrome(String s) {
        int[] freq = new int[58];

        for(char c : s.toCharArray())
            ++freq[c - 'A'];

        int count = 0, odd = 0;

        for(int i = 0; i < 58; ++i)
            if (freq[i] % 2 == 0)
                count += freq[i];
            else {
                count = count + freq[i] - 1;
                odd = 1;
            }

        return count + odd;
    }
}
