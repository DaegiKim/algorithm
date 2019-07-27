package hackerrank.java_bigdecimal;

import java.math.BigDecimal;
import java.util.*;
class Solution{
    public static void main(String []args){
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
        sc.close();

        //Write your code here
        Arrays.sort(s,0, n, (a,b)-> {
            BigDecimal bA = new BigDecimal(a);
            BigDecimal bB = new BigDecimal(b);

            return bB.compareTo(bA);
        });

        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }
}


//import java.math.BigDecimal;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
//public class Solution {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int n = Integer.parseInt(scanner.nextLine());
//
//        List<Pair> list = new ArrayList<>();
//        while(n-->0) {
//            String key = scanner.nextLine();
//            BigDecimal value = new BigDecimal(key);
//
//            Pair pair = new Pair(key, value);
//            list.add(pair);
//        }
//
//        list.sort(Pair::compareTo);
//        list.forEach(p -> System.out.println(p.key));
//    }
//}
//
//class Pair implements Comparable<Pair> {
//    String key;
//    BigDecimal value;
//
//    Pair(String key, BigDecimal value) {
//        this.key = key;
//        this.value = value;
//    }
//
//    @Override
//    public int compareTo(Pair o) {
//        return o.value.compareTo(this.value);
//    }
//}
