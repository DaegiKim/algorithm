package boj._2910;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] split = br.readLine().split(" ");

        int n = Integer.parseInt(split[0]);
        int c = Integer.parseInt(split[0]);

        Map<String, Message> map = new HashMap<>();

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            String key = st.nextToken();
            if(map.containsKey(key)) {
                Message message = map.get(key);
                message.count = message.count + 1;
                map.replace(key, message);
            } else {
                Message message = new Message();
                message.message = key + " ";
                message.count = 1;
                message.order = i;
                map.put(key, message);
            }
        }

        List<Message> messageList = new ArrayList<>(map.values());
        messageList.sort(Message::compareTo);

        messageList.stream().map(x -> x.message.repeat(x.count)).forEach(System.out::print);
    }
}

class Message implements Comparable<Message> {
    int order;
    int count;
    String message;

    @Override
    public int compareTo(Message o) {
        int countCompare = Integer.compare(o.count, this.count);
        return countCompare!=0?countCompare:Integer.compare(this.order, o.order);
    }
}