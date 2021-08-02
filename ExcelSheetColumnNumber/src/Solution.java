public class Solution {
    public int titleToNumber(String columnTitle) {
        int pos = 0, res = 0;

        for(int i = columnTitle.length() - 1; i >= 0; --i, ++pos) {
            int letter = (columnTitle.charAt(i) - 'A') + 1;
            res = res + (letter * (int)Math.pow(26, pos));
        }

        return res;
    }
}
