public class Solution {
    public int countSegments(String s) {
        int n = s.length(), count = 0, i = 0;

        while(i < n) {
            if(s.charAt(i) != ' ') {
                ++count;
                while(i < n && s.charAt(i) != ' ')
                    ++i;
            } else
                while(i < n && s.charAt(i) == ' ')
                    ++i;
        }

        return count;
    }
}
