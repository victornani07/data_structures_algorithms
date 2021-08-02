import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> readBinaryWatch(int turnedOn) {
        List<String> time = new ArrayList<>();

        for(int i = 0; i < 12; ++i)
            for (int j = 0; j < 60; ++j)
                if(Integer.bitCount(i) + Integer.bitCount(j) == turnedOn) {
                    String minutes = "";

                    if(j <= 9) minutes += "0" + j;
                    else minutes += j;

                    time.add(i + ":" + minutes);
                }

        return time;
    }
}
