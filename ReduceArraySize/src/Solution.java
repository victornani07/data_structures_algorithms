import java.util.*;

public class Solution {
    public int minSetSize(int[] arr) {
        Arrays.sort(arr);
        List<Integer> freq = new ArrayList<>();
        int size = arr.length, start = arr[0], countFreq = 1;

        for(int i = 1; i < size; ++i) {
            if(arr[i] != start) {
                start = arr[i];
                freq.add(countFreq);
                countFreq = 0;
            }
            ++countFreq;
        }

        freq.add(countFreq);
        Collections.sort(freq);
        int sizeSoFar = size, elements = 0;

        for(int i = freq.size() - 1; i >= 0; --i) {
            sizeSoFar -= freq.get(i);
            ++elements;
            if(sizeSoFar <= size / 2)
                break;
        }

        return elements;
    }
}
