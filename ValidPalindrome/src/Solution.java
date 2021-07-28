public class Solution {
    public boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;

        while(left <= right) {
            char a = Character.toLowerCase(s.charAt(left));
            char b = Character.toLowerCase(s.charAt(right));

            if(!Character.isLetterOrDigit(a)) {
                ++left;
                continue;
            }

            if(!Character.isLetterOrDigit(b)) {
                --right;
                continue;
            }

            if(a != b)
                return false;

            ++left;
            --right;
        }

        return true;
    }
}
