public class Main {
    public static String MinWindowSubstring(String[] strArr) {
        String N = strArr[0], K = strArr[1];
        int[] stringOccurences = new int[26], patternOccurences = new int[26];
        int counter = 0, startingIndex = 0, minWindowSize = Integer.MAX_VALUE, endingIndex = N.length() - 1, st = 0;

        for(int i = 0; i < K.length(); ++i)
            ++patternOccurences[K.charAt(i) - 'a'];

        for(int i = 0; i < N.length(); ++i) {
            if(patternOccurences[N.charAt(i) - 'a'] != 0) {
                ++stringOccurences[N.charAt(i) - 'a'];
                if(stringOccurences[N.charAt(i) - 'a'] <= patternOccurences[N.charAt(i) - 'a'])
                    ++counter;
            }
            if(counter == K.length()) {
                String window = N.substring(startingIndex, i + 1);
                for(int j = 0; j < window.length(); ++j)
                    if ((stringOccurences[window.charAt(j) - 'a'] - 1 >= patternOccurences[window.charAt(j) - 'a']) ||
                            patternOccurences[window.charAt(j) - 'a'] == 0) {
                        --stringOccurences[window.charAt(j) - 'a'];
                        ++startingIndex;
                    } else
                        break;
                int currentSize = i - startingIndex + 1;
                if(currentSize < minWindowSize) {
                    minWindowSize = currentSize;
                    endingIndex = i + 1;
                    st = startingIndex;
                }
            }
        }

        return N.substring(st, endingIndex);
    }

    public static void main(String[] args) {
        String[] strings = new String[]{"vvavereveaevafefaef", "vvev"};
        System.out.println(MinWindowSubstring(strings));
    }
}
