package lesson3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class L3Zad5 {
    public static void main(String[] args) {
        int len = 0;
        Scanner s5 = new Scanner(System.in);
        System.out.print("Enter array size: ");
        if (s5.hasNextInt()) {
            len = s5.nextInt();
            if (5 < len & len <= 10) {
                System.out.print("");
            } else {
                System.out.print("Incorrect!!! Enter 5<size<=10 please: ");
                len = s5.nextInt();
            }
        } else {
            System.out.print("Incorrect!!! Enter number >5 and <=10:");
        }
        int ar1[] = new int[len];
        Random ran = new Random();
        int len2 = 0;
        for (int i = 0; i < ar1.length; i++) {
            ar1[i] = ran.nextInt(100);
            if (ar1[i] % 2 == 0) {
                len2 = len2 + 1;
            }
        }
        int ar2[] = new int[len2];
        int j = 0;
        for (int w = 0; w < ar1.length; w++) {
            if (ar1[w] % 2 == 0) {
                ar2[j] = ar1[w];
                j++;
            }
        }
        System.out.println(Arrays.toString(ar1));
        System.out.println(len2);
        System.out.println(Arrays.toString(ar2));

    }
}