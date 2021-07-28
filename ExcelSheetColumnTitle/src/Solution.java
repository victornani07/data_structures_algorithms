public class Solution {
    public String convertToTitle(int columnNumber) {
        String title = "";

        while(columnNumber > 0) {
            int a = columnNumber % 26;
            char c;

            if(a == 0) {
                c = 'Z';
                --columnNumber;
            }
            else
                c = (char)('A' + a - 1);

            title = c + title;
            columnNumber /= 26;
        }

        return title;
    }
}
