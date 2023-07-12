package lesson3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class L3Zad3 {
    public static void main(String[] args) {
        int len;
        Scanner s3 = new Scanner(System.in);
        System.out.print("Enter length array: ");
        len = s3.nextInt();
        double a3[] = new double[len];
        for (int i = 0; i < a3.length; i++) {
            a3[i] = Math.random();
        }
        double max = a3[0];
        double min = a3[0];
        double x = a3[0];
        for (int k = 1; k < a3.length; k++) {
            if (a3[k] > max) {
                max = a3[k];
            }
            if (a3[k] < min) {
                min = a3[k];
            }
            x = x + a3[k];
        }
        System.out.println(Arrays.toString(a3));
        System.out.println("max: " + max);
        System.out.println("min: " +min);
        System.out.println("average: " + x / len);
    }
}