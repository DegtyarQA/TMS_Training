package lesson3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class L3Zad7 {
    public static void main(String[] args) {
        Random r1 = new Random();
        int[][][] array3 = new int[5][4][2];
        for (int i = 0; i < 5; i++) {
            for (int g = 0; g < 4; g++) {
                for (int n = 0; n < 2; n++) {
                    array3[i][g][n] = r1.nextInt(100);
                }
            }
        }
        System.out.println(Arrays.deepToString(array3));
        int delta = 0;
        System.out.print("Enter delta: ");
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            delta = scanner.nextInt();
        } else {
            System.out.print("Incorrect number!!!");
        }
        for (int y = 0; y < 5; y++) {
            for (int t = 0; t < 4; t++) {
                for (int v = 0; v < 2; v++) {
                    array3[y][t][v] = array3[y][t][v] + delta;
                }
            }
        }
        System.out.println(Arrays.deepToString(array3));
    }
}