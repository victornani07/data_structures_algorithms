import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public int firstUniqChar(String s) {
        Map<Character, Integer[]> m = new HashMap<>();
        List<Character> chars = new ArrayList<>();

        for(int i = 0; i < s.length(); ++i) {
            char c = s.charAt(i);
            if(!m.containsKey(c)) {
                m.put(c, new Integer[]{1, i});
                chars.add(c);
            }
            else
                ++m.get(c)[0];
        }

        for(Character c : chars) {
           Integer[] arr = m.get(c);
           if(arr[0] == 1)
               return arr[1];
        }

        return -1;
    }
}
