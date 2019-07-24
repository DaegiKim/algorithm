package boj._10845;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        LinkedList<Integer> stack = new LinkedList<>();

        while(n-->0) {
            String command = scanner.next();

            try {
                switch (command) {
                    case "push":
                        stack.add(scanner.nextInt());
                        break;
                    case "pop":
                        System.out.println(stack.removeFirst());
                        break;
                    case "front":
                        System.out.println(stack.getFirst());
                        break;
                    case "back":
                        System.out.println(stack.getLast());
                        break;
                    case "size":
                        System.out.println(stack.size());
                        break;
                    case "empty":
                        System.out.println(stack.isEmpty()?"1":"0");
                        break;
                }
            } catch (NoSuchElementException ex) {
                System.out.println("-1");
            }
        }
    }
}
