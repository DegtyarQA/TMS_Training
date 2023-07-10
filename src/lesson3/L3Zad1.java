package lesson3;

import java.util.Scanner;

public class L3Zad1 {
    public static void main(String[] args) {
        int[] array1 = new int[]{1, 2, 6, 8, 9, 11, 25, 23, 99, 34};
        Scanner sc1 = new Scanner(System.in);
        int b = 0;
        int a;
        System.out.print("Enter number: ");
        if (sc1.hasNextInt()) {
            a = sc1.nextInt();
        } else {
            System.out.print("number incorrect!!!");
        }
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] == a) {
                System.out.print("number in array1!!!" + b);
                break;
            }
            b++;
        }
        System.out.print("number is NOT in array1!!!" + b);
    }
}
