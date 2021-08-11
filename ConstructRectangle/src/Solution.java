public class Solution {
    public int[] constructRectangle(int area) {
        int l = area, w = 1, minDiff = area - 1;

        for(int i = 2; i * i <= area; ++i)
            if(area % i == 0) {
                int newL = area / i;
                int diff = newL - i;
                if(diff < minDiff && newL >= i) {
                    minDiff = diff;
                    l = newL;
                    w = i;
                }
            }

        return new int[]{l, w};
    }
}
