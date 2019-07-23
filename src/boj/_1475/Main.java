package boj._1475;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String roomNumber = scanner.next();

        String[] split = roomNumber.split("");

        Map<Integer, Integer> map = new HashMap<>();

        AtomicLong sixNineCount = new AtomicLong();
        AtomicInteger maxK = new AtomicInteger(-1);
        AtomicInteger maxV = new AtomicInteger(Integer.MIN_VALUE);

        Arrays.stream(split).forEach(c -> {
            int key = Integer.valueOf(c);

            map.merge(key, 1, Integer::sum);

            if(c.equals("6") || c.equals("9")) {
                sixNineCount.getAndIncrement();
            }

            if(map.get(key) > maxV.get()) {
                maxK.set(key);
                maxV.set(map.get(key));
            }
        });

        int count = (int) Math.ceil((double)sixNineCount.get()/2);

        if(maxK.get() != 9 && maxK.get() != 6) {
            System.out.println(maxV.get());
        } else {
            System.out.println(count);
        }
    }
}
