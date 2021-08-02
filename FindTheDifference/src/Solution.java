public class Solution {
    public char findTheDifference(String s, String t) {
        int[] freqS = new int[26];
        int[] freqT = new int[26];
        int i;

        for(i = 0; i < s.length(); ++i) {
            ++freqS[s.charAt(i) - 'a'];
            ++freqT[t.charAt(i) - 'a'];
        }

        ++freqT[t.charAt(i) - 'a'];
        char c = 'a';

        for(i = 0; i < 26; ++i)
            if(freqS[i] != freqT[i]) {
                c = (char) ('a' + i);
                break;
            }

        return c;
    }

}
