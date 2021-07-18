public class Solution {
    public int lengthOfLastWord(String s) {
        int length = 0, i = s.length() - 1;

        while(i >= 0) {
            if(s.charAt(i) == ' ')
                --i;
            else {
                int j = i;
                while(j >= 0) {
                    if(s.charAt(j) == ' ')
                        break;
                    ++length;
                    --j;
                }
                break;
            }
        }

        return length;
    }
}
