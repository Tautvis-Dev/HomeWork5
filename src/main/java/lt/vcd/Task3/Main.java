package lt.vcd.Task3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    static void main() throws FileNotFoundException {
        Scanner fin = new Scanner(new File("studentsGrades.txt"));
        int d = fin.nextInt();
        int s = fin.nextInt();
        int[][] grades = new int[s][d];
        float studentAverage;
        float[] averageGrades = new float[s];
        float groupAverage = 0;
        float maxAverage = averageGrades[0];


        for (int i = 0; i < s; i++) {
            for (int j = 0; j < d; j++) {
                grades[i][j]=fin.nextInt();
            }
        }

        for (int i = 0; i < s; i++) {
            studentAverage = 0;
            for (int j = 0; j < d; j++) {
                studentAverage += grades[i][j];
            }
            averageGrades[i] = studentAverage / d;
        }

        for (float sa:averageGrades) {
            groupAverage += sa;
            System.out.println("Student averages: "+sa);
        }
        System.out.println("Group averages: "+groupAverage / s);


        for (int i = 0; i < averageGrades.length; i++) {
            if (averageGrades[i] > maxAverage) {
                maxAverage = averageGrades[i];
            }
        }

        for (int i = 0; i < averageGrades.length; i++) {
            if (averageGrades[i] == maxAverage) {
                System.out.println("Highest-performing student: " + (i + 1));
            }
        }


        int lessThan5 = 0;
        for (int i = 0; i < s; i++) {
            for (int j = 0; j < d; j++) {
                if (grades[i][j] < 5) {
                    lessThan5++;
                    break;
                }
            }
        }

        if (lessThan5 > 0) {
            System.out.println("Students with at least one grade below 5: " + lessThan5);
        } else {
            System.out.println("Students with at least one grade below 5: None");
        }





    }
}
