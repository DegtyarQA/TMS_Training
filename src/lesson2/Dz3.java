package lesson2;

import java.util.Scanner;

public class Dz3 {
    public static void main(String[] args) {
        int x;
        Scanner s3 = new Scanner(System.in);
        System.out.print("Введите число: ");
        x = s3.nextInt();
        if (x % 2 == 0) {
            System.out.println("Целое");
        } else System.out.println("Дробное");
    }
}
