package lt.vcd.Task4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    static void main() throws FileNotFoundException {
        Scanner fin = new Scanner(new File("matrix.txt"));
        int n = fin.nextInt();
        int[][] m = new int [n][n];

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                m[i][j]=fin.nextInt();
                if (i == j || n - 1 - i == j) {
                    m[i][j] = 0;
                }
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }
}
