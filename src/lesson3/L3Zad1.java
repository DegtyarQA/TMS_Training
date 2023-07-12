package lesson3;

import java.util.Scanner;

public class L3Zad1 {
    public static void main(String[] args) {
        int[] array1 = new int[]{1, 2, 6, 8, 9, 11, 25, 23, 99, 34};
        Scanner sc1 = new Scanner(System.in);
        int a;
        System.out.print("Enter number: ");
        a = sc1.nextInt();
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] == a) {
                System.out.print("number in array1!!!");
                break;
            }
        }
        System.out.print("number is NOT in array1!!!");
    }
}
