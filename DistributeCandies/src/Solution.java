import java.util.HashSet;

public class Solution {
    public int distributeCandies(int[] candyType) {
        HashSet<Integer> types = new HashSet<>();

        for(int num : candyType)
            types.add(num);

        return Math.min(types.size(), candyType.length / 2);
    }
}
