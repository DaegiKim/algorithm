package hackerrank.time_conversion;

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
        /*
         * Write your code here.
         */

        String result = "";

        if(s.lastIndexOf("PM")>=0) {
            if(s.startsWith("12")) {
                result += s.substring(0, 8);
            } else {
                result += (Integer.valueOf(s.substring(0, 2))+12)%24;
                result += s.substring(2, 8);
            }

        } else {
            if(s.startsWith("12")) {
                result += "00";
                result += s.substring(2, 8);
            } else {
                result = s.substring(0, s.length()-2);
            }
        }

        return result;
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        String result = timeConversion(s);
        System.out.println(result);

//        bw.write(result);
//        bw.newLine();

//        bw.close();
    }
}
