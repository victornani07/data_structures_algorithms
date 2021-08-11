import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<Integer, List<String>> m = new HashMap<>();
        int minIndex = Integer.MAX_VALUE;

        for(int i = 0; i < list1.length; ++i)
            for(int j = 0; j < list2.length; ++j)
                if(list1[i].equals(list2[j]))
                    if (i + j < minIndex) {
                        minIndex = i + j;
                        List<String> restaurants = new ArrayList<>();
                        restaurants.add(list1[i]);
                        m.put(minIndex, restaurants);
                    } else if(i + j == minIndex) {
                        List<String> restaurants = m.get(i + j);
                        restaurants.add(list1[i]);
                        m.replace(i + j, restaurants);
                    }

        List<String> restaurants = m.get(minIndex);
        int n = restaurants.size();
        String[] ans = new String[n];

        for(int i = 0; i < n; ++i)
            ans[i] = restaurants.get(i);

        return ans;
    }
}
