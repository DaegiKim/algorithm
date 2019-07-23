package boj._10171;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] arr = {"\\    /\\"," )  ( ')","(  /  )"," \\(__)|"};
        Arrays.stream(arr).forEach(System.out::println);
    }
}
