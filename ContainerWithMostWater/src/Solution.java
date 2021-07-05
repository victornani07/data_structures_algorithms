public class Solution {
    public int maxArea(int[] height) {
        int left = 0, right = height.length - 1, area = 0;

        while(left < right) {
            int currentArea = (right - left) * Math.min(height[left], height[right]);
            area = Math.max(area, currentArea);
            if(height[left] < height[right])
                ++left;
            else
                --right;
        }

        return area;
    }
}
