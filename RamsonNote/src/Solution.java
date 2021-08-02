import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> m1 = new HashMap<>();
        int[] m2 = new int[26];

        for(int i = 0; i < ransomNote.length(); ++i)
            if(!m1.containsKey(ransomNote.charAt(i)))
                m1.put(ransomNote.charAt(i), 1);
            else
                m1.replace(ransomNote.charAt(i), m1.get(ransomNote.charAt(i)) + 1);

        for(int i = 0; i < magazine.length(); ++i)
            ++m2[magazine.charAt(i) - 'a'];

        Iterator it = m1.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry)it.next();
            if(m2[(char)pair.getKey() - 'a'] < (int)pair.getValue())
                return false;
            it.remove();
        }

        return true;
    }
}
