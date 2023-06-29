package lesson2;

import java.util.Scanner;

public class Dz4 {
    public static void main(String[] args) {
        int t;
        Scanner s4 = new Scanner(System.in);
        System.out.print("Введите температуру: ");
        t = s4.nextInt();
        if (t > -5) {
            System.out.println("Тепло");
        } else if (-20 < t & t <= -5) {
            System.out.println("Нормально");
        } else if (t <= -20) {
            System.out.println("Холодно");
        }
    }
}
