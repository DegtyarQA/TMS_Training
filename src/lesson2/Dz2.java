package lesson2;

import java.util.Scanner;

public class Dz2 {
    public static void main(String[] args) {
        int p;
        Scanner s2 = new Scanner(System.in);
        System.out.print("Введите месяц: ");
        p = s2.nextInt();
        if (3 <= p & p <= 5) {
            System.out.println("Весна");
        } else if (6 <= p & p <= 8) {
            System.out.println("Лето");
        } else if (9 <= p & p <= 11) {
            System.out.println("Осень");
        } else if (1 <= p & p <= 2) {
            System.out.println("Зима");
        } else if (p == 12) {
            System.out.println("Зима");
        } else System.out.println("Incorrect number!!!");
    }
}
