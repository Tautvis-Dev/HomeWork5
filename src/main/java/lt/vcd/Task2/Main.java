package lt.vcd.Task2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    static void main() throws FileNotFoundException {
        Scanner fin = new Scanner(new File("houses.txt"));
        int n = fin.nextInt();
        int[] houses = new int[n];
        int totalResidents = 0;
        int residentsLeft = 0;
        int residentsRight = 0;
        int houseLeft = 0;
        int houseRight = 0;

        for (int i = 0; i < n; i++) {
            houses[i] = fin.nextInt();
            totalResidents += houses[i];
        }

        for (int h:houses) {
            if (h % 2 == 0) {
                residentsRight += h;
                houseRight++;
            } else {
                residentsLeft += h;
                houseLeft++;
            }
        }

        System.out.println("Total residents: " + totalResidents);
        System.out.println("Residents on the left: " + residentsLeft);
        System.out.println("Residents on the right: " + residentsRight);
        System.out.println("Average per house on the left: " + (float) residentsLeft / houseLeft);
        System.out.println("Average per house on the right: " + (float) residentsRight / houseRight);
    }
}
