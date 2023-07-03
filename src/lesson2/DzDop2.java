package lesson2;

import java.util.Scanner;

public class DzDop2 {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        float summa;
        int srok;
        float stavka = 7;
        float procenty = 0;
        float vsego = 0;
        System.out.print("Введите срок вклада: ");
        srok = s1.nextInt();
        System.out.print("Введите сумму вклада: ");
        summa = s1.nextFloat();
        for (int i = 1; i <= srok; i++) {
            float summa_mes = summa * stavka / 100;
            procenty = procenty + summa_mes;
            System.out.println("% за месяц " + i + ": " + summa_mes);
            summa = summa + summa_mes;
        }
        vsego = procenty + summa;
        System.out.println("Итого процентов за вксь срок: " + procenty);
        System.out.println("Итого сумма за весь срок с учетом %: " + vsego);
    }
}
