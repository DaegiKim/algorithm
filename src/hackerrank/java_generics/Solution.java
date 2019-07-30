package hackerrank.java_generics;

public class Solution {
    public static void main(String[] args) {

    }
}

class Printer {
    <T> void printArray(T[] arr) {
        for(T a : arr) {
            System.out.println(a);
        }
    }
}
