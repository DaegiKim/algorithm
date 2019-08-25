package boj._1713;

import java.io.*;


class Picture {
    int rec;
    int time;

    Picture(int rec, int time) {
        this.rec = rec;
        this.time = time;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int k = Integer.parseInt(br.readLine());

        String[] split = br.readLine().split(" ");

        Picture[] arr = new Picture[101];
        int added = 0;

        for (int i = 0; i < split.length; i++) {
            int studentNum = Integer.parseInt(split[i]);
            if(arr[studentNum] != null) {
                arr[studentNum].rec++;
            } else {
                if(added < n) {
                    arr[studentNum] = new Picture(1, i);
                    added++;
                } else {
                    //remove
                    int mIndex = minimumIndex(arr);
                    arr[mIndex] = null;
                    arr[studentNum] = new Picture(1, i);
                }
            }
        }

        for (int i = 0; i < 101; i++) {
            if(arr[i] != null) {
                bw.write(String.valueOf(i));
                bw.write(' ');
            }
        }
        bw.flush();
        bw.close();
    }

    private static int minimumIndex(Picture[] arr) {
        int minimumIndex = 0;

        Picture min = null;

        for (int i = 0; i < arr.length; i++) {
            if(min == null) {
                if(arr[i] != null) {
                    min = arr[i];
                    minimumIndex = i;
                }
            } else {
                Picture cur = arr[i];
                if(cur != null) {
                    if(min.rec > cur.rec) {
                        minimumIndex = i;
                        min = arr[minimumIndex];
                    } else if(min.rec == cur.rec && min.time > cur.time) {
                        minimumIndex = i;
                        min = arr[minimumIndex];
                    }
                }
            }
        }

        return minimumIndex;
    }
}
