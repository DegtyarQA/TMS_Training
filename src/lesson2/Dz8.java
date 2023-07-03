package lesson2;

import java.util.Scanner;

public class Dz8 {
    public static void main(String[] args) {
        Scanner s8 = new Scanner(System.in);
        int f;
        int d = 0;
        System.out.print("Введите целое число: ");
        f = s8.nextInt();
        for (int i = 1; i <= f; i++) {
            d = d + i;
        }
        System.out.println("Сумма чисел до введенного числа включительно: " + d);
    }
}
