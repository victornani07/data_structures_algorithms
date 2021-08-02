public class Solution {
    public boolean isSubsequence(String s, String t) {
        int count = 0, j = 0, n = s.length(), m = t.length();

        for(int i = 0; i < n; ++i)
            while(j < m) {
                if(t.charAt(j) == s.charAt(i)) {
                    ++count;
                    ++j;
                    break;
                }
                ++j;
            }

        return count == n;
    }
}
