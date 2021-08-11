public class Solution {
    public String licenseKeyFormatting(String s, int k) {
        StringBuilder newKey = new StringBuilder();
        s = s.replace("-", "");
        int n = s.length() - 1, count = 0;

        for(int i = n; i >= 0; --i) {
            newKey.append(Character.toUpperCase(s.charAt(i)));
            if(++count == k) {
                if(i != 0) newKey.append('-');
                count = 0;
            }
        }
        return newKey.reverse().toString();
    }
}
