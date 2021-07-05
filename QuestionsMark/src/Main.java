public class Main {
    public static String QuestionsMarks(String str) {
        int digits = 0, pairs = 0, sum = 10, questionMarks = 0, checkForQuestionMarks = 0;

        for(int i = 0; i < str.length(); ++i) {
            if(str.charAt(i) >= '1' && str.charAt(i) <= '9') {
                ++digits;
                sum -= (str.charAt(i) - '0');
                checkForQuestionMarks = 1;
            }
            if(checkForQuestionMarks == 1)
                if(str.charAt(i) == '?')
                    ++questionMarks;
            if(digits == 2) {
                if (sum == 0 && questionMarks != 3)
                    return "false";
                else if (sum == 0 && questionMarks == 3)
                    ++pairs;
                sum = 10;
                digits = 0;
                questionMarks = 0;
                checkForQuestionMarks = 0;
            }
        }

        if(pairs != 0)
            return "true";
        else
            return "false";
    }

    public static void main(String[] args) {
        System.out.println(QuestionsMarks("5??aaaaaaaaaaaaaaaaaaa?5?5"));
    }
}
