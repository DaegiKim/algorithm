package boj._1966;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        for (int i = 0; i < T; i++) {
            int N = scanner.nextInt();
            int theNumber = scanner.nextInt();

            Queue<Document> queue = new LinkedList<>();

            for (int j = 0; j < N; j++) {
                int priority = scanner.nextInt();

                Document document = new Document();
                document.number = j;
                document.priority = priority;

                queue.add(document);
            }

            int count = 0;

            while(!queue.isEmpty()) {
                Document doc = queue.poll();
                if(isBiggestPriority(doc, queue)) {
                    count++;

                    if(doc.number == theNumber) {
                        break;
                    }
                } else {
                    queue.add(doc);
                }
            }

            System.out.println(count);
        }
    }

    private static boolean isBiggestPriority(Document doc, Queue<Document> queue) {
        long count = queue.stream().filter(d -> d.priority > doc.priority).count();
        return count==0;
    }
}

class Document {
    int number;
    int priority;
}
