package hackerrank.phone_book;

//Complete this code or write your own from scratch

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

class Solution{
    public static void main(String []argh) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Map<String, Integer> phoneBook = new HashMap<>();
        for(int i=0;i<n;i++)
        {
            String name = br.readLine();
            int phone = Integer.parseInt(br.readLine());

            phoneBook.put(name, phone);
        }
        String s;
        while((s = br.readLine()) != null)
        {
            Integer v = phoneBook.get(s);
            if(v != null) {
                System.out.println(String.format("%s=%d", s, v));
            } else {
                System.out.println("Not found");
            }
        }
    }
}