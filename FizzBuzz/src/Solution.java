import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> fizz = new ArrayList<>(n + 1);

        for(int i = 1; i <= n; ++i)
            if(i % 3 == 0 && i % 5 == 0)
                fizz.add( "FizzBuzz");
            else if(i % 3 == 0)
                fizz.add( "Fizz");
            else if(i % 5 == 0)
                fizz.add( "Buzz");
            else
                fizz.add( "" + i);

        return fizz;
    }
}
