package programmers._17686;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String[] files = {"img12.png", "img10.png", "img02.png", "img1.png", "IMG01.GIF", "img2.JPG"};

        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.solution(files)));
    }
}

class Solution {
    public String[] solution(String[] files) {
        List<File> fileList = new ArrayList<>();

        for (String fileName : files) {
            fileList.add(File.parse(fileName));
        }

        fileList.sort(File::compareTo);

        String[] answer = new String[fileList.size()];

        for (int i = 0; i < fileList.size(); i++) {
            answer[i] = fileList.get(i).fileName;
        }

        return answer;
    }
}

class File implements Comparable<File> {
    private String head;
    private int number;
    String fileName;

    static File parse(String fileName) {
        final String originalName = fileName;

        fileName = fileName.toLowerCase();

        String head = fileName.split("[0-9]")[0];

        fileName = fileName.substring(head.length());

        String numberString = "";
        for (int i = 0; i < fileName.length(); i++) {
            if(Character.isDigit(fileName.charAt(i)) && i<5) {
                numberString+=fileName.charAt(i);
            } else {
                break;
            }
        }

        File file = new File();
        file.fileName = originalName;
        file.head = head;
        file.number = Integer.parseInt(numberString);

        return file;
    }

    @Override
    public String toString() {
        return String.format("%s", fileName);
    }

    @Override
    public int compareTo(File o) {
        int headCompare = this.head.compareTo(o.head);

        if(headCompare != 0) {
            return headCompare;
        } else {
            return Integer.compare(this.number, o.number);
        }
    }
}