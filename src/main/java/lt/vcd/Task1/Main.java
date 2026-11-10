package lt.vcd.Task1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    static void main() throws FileNotFoundException {
        Scanner fin = new Scanner(new File("circle.txt"));
        int n = fin.nextInt();
        int[] circle = new int[n];
        int didziausiasSpindulys = circle[0];
        int kiek = 0;

        for(int i = 0; i < n; i++) {
            circle[i] = fin.nextInt();
            if (circle[i] > didziausiasSpindulys) {
                didziausiasSpindulys = circle[i];
            }
        }
        for (int t:circle) {
            if (t == didziausiasSpindulys) {
                kiek++;
            }
        }
        System.out.print(didziausiasSpindulys + " - " + kiek);
    }
}
