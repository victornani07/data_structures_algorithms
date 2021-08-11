public class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int n = s.length();
        String temp = "";

        for(int i = 0; i < n - 1; ++i) {
            temp += s.charAt(i);
            String aux = s.substring(i + 1);
            int l = temp.length();
            while(aux.indexOf(temp) == 0)
                aux = aux.substring(l);
            if(aux.length() == 0)
                return true;
        }

        return false;
    }
}
