package boj._2108;

import java.io.*;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(br.readLine());
            arr[i] = number;
        }

        IntSummaryStatistics intSummaryStatistics = Arrays.stream(arr).summaryStatistics();

        //산술평균
        bw.write(BigDecimal.valueOf(intSummaryStatistics.getAverage()).setScale(0, RoundingMode.HALF_UP).toString());
        bw.newLine();

        //중앙값
        arr = Arrays.stream(arr).sorted().toArray();
        bw.write(String.valueOf(arr[n/2]));
        bw.newLine();

        //최빈값
        List<Map.Entry<Integer, Long>> sortedList = Arrays.stream(arr).boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().sorted((a, b) -> {
                    int byValue = Long.compare(b.getValue(), a.getValue());
                    return byValue != 0 ? byValue : Integer.compare(a.getKey(), b.getKey());
                })
                .collect(Collectors.toList());
        bw.write(String.valueOf(
                sortedList.size() == 1 ? sortedList.get(0).getKey() : sortedList.get(0).getValue().equals(sortedList.get(1).getValue()) ? sortedList.get(1).getKey() : sortedList.get(0).getKey()
        ));
        bw.newLine();

        //범위
        bw.write(String.valueOf(intSummaryStatistics.getMax()-intSummaryStatistics.getMin()));
        bw.flush();
        bw.close();
    }
}
