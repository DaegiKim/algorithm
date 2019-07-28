package boj._17363;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] split = br.readLine().split(" ");
        int r = Integer.parseInt(split[0]);
        int c = Integer.parseInt(split[1]);

        char[][] arr = new char[r][c];

        for (int i = 0; i < r; i++) {
            arr[i] = br.readLine().toCharArray();
        }

        char[][] rotated = rotateMatrixCounterClockwise(arr);

        for (char[] chars : rotated) {
            for (int j = 0; j < rotated[0].length; j++) {
                System.out.print(chars[j]);
            }
            System.out.println();
        }
    }

    private static char[][] rotateMatrixCounterClockwise(char[][] matrix) {
        char[][] rotated = new char[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix[0].length; ++i) {
            for (int j = 0; j < matrix.length; ++j) {
                char c = matrix[j][matrix[0].length - i - 1];
                switch (c) {
                    case '-':
                        c = '|';
                        break;
                    case '|':
                        c = '-';
                        break;
                    case '/':
                        c = '\\';
                        break;
                    case '\\':
                        c = '/';
                        break;
                    case '^':
                        c = '<';
                        break;
                    case '<':
                        c = 'v';
                        break;
                    case 'v':
                        c = '>';
                        break;
                    case '>':
                        c = '^';
                        break;
                }

                rotated[i][j] = c;
            }
        }
        return rotated;
    }
}
