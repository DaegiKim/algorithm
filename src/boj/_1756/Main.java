package boj._1756;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] s = br.readLine().split(" ");

        int d = Integer.parseInt(s[0]);
        int n = Integer.parseInt(s[1]);

        if(d<n) {
            System.out.println(0);
            return;
        }

        int ovenMinimumSize = Integer.MAX_VALUE;
        List<Integer> ovenSizeList = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::valueOf)
                .boxed()
                .collect(Collectors.toList());

        for (int i = 0; i < ovenSizeList.size(); i++) {
            Integer ovenSize = ovenSizeList.get(i);
            ovenMinimumSize = Math.min(ovenSize, ovenMinimumSize);
            ovenSizeList.set(i, ovenMinimumSize);
        }

        Collections.reverse(ovenSizeList);

        LinkedList<Integer> pizzaList = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::valueOf)
                .boxed().collect(Collectors.toCollection(LinkedList::new));

        Integer currentPizza = pizzaList.removeFirst();
        int lastPizzaIndex = d;
        for (int i = 0; i < ovenSizeList.size(); i++) {
            if(currentPizza<=ovenSizeList.get(i)) {
                lastPizzaIndex = i;
                if(!pizzaList.isEmpty()) {
                    currentPizza = pizzaList.removeFirst();
                } else {
                    break;
                }
            }
        }
        System.out.println(pizzaList.isEmpty() ? ovenSizeList.size()-lastPizzaIndex : 0);
    }
}
