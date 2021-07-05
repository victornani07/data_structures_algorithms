import java.util.*;
import java.io.*;

public class Main {


    public static String FindIntersection(String[] strArr) {
        String[] firstString = strArr[0].split(", "), secondString = strArr[1].split(", ");
        int firstStringLength = firstString.length, secondStringLength = secondString.length, i = 0, j = 0;
        String intersectionString = "";

        while(i < firstStringLength && j < secondStringLength) {
            int fsn = Integer.parseInt(firstString[i]), ssn = Integer.parseInt(secondString[j]);
            if(fsn == ssn) {
                intersectionString += fsn + ",";
                ++i;
                ++j;
            }
            else if(fsn > ssn)
                ++j;
            else
                ++i;
        }

        if (intersectionString.equals(""))
            return "false";

        return intersectionString.substring(0, intersectionString.length() - 1);
    }

    public static void main (String[] args) {
        String[] strArr = new String[2];
        strArr[0] = "1, 3, 4, 7, 13";
        strArr[1] = "1, 2, 4, 13, 15";

        System.out.print(FindIntersection(strArr));
    }

}