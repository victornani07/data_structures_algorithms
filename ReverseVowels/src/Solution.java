public class Solution {
    private static boolean isVowel(char c) {
        return "AEIOUaeiou".indexOf(c) != -1;
    }

    public String reverseVowels(String s) {
        int left = 0, right = s.length() - 1;
        char[] t = new char[s.length()];

        while(left <= right) {
          char a = s.charAt(left);
          char b = s.charAt(right);
          if(isVowel(a) && isVowel(b)) {
              t[left] = b;
              t[right] = a;
              ++left;
              --right;
          }

          if(!isVowel(a)) {
              t[left] = a;
              ++left;
          }

          if(!isVowel(b)) {
              t[right] = b;
              --right;
          }
        }

        return String.valueOf(t);
    }
}
