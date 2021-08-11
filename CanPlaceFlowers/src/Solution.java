public class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0, i = 0;
        if(n == 0) return true;

        while(i < flowerbed.length) {
            if(flowerbed[i] == 0 && (i == 0 || flowerbed[i - 1] == 0) && (i == flowerbed.length - 1 || flowerbed[i + 1] == 0)) {
                flowerbed[i] = 1;
                ++count;
            }
            ++i;
        }

        return count >= n;
    }
}
