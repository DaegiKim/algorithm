package hackerrank.java_anagrams;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        if(a.length() != b.length()) {
            return false;
        }

        char[] aArr = a.toLowerCase().toCharArray();
        char[] bArr = b.toLowerCase().toCharArray();

        int[] arr = new int[26];

        for (int i = 0; i < aArr.length; i++) {
            int index = aArr[i] - 97;
            arr[index]++;
        }

        for (int i = 0; i < bArr.length; i++) {
            int index = bArr[i] - 97;
            arr[index]--;
            if(arr[index] < 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}