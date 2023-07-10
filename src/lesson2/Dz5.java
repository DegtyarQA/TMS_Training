package lesson2;

import java.util.Scanner;

public class Dz5 {
    public static void main(String[] args) {
        System.out.print("Введите число от 1 до 4: ");
        int color;
        Scanner s5 = new Scanner(System.in);
        color=s5.nextInt();
        switch (color) {
            case 1:
                System.out.print("Красный");
                break;
            case 2:
                System.out.print("Оранжевый");
                break;
            case 3:
                System.out.print("Желтый");
                break;
            case 4:
                System.out.print("Зеленый");
                break;
            case 5:
                System.out.print("Голубой");
                break;
            case 6:
                System.out.print("Синий");
                break;
            case 7:
                System.out.print("Фиолетовый");
                break;
            default:
                System.out.print("Incorrect color");
        }
    }
}
