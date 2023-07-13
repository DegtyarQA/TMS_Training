package Lesson4;

import java.util.Scanner;

public class ProgramCat {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.name = "Tommy";
        cat.fodd_level = 5;
        Scanner s1 = new Scanner(System.in);
        System.out.print("Enter food size: ");
        int food_part = s1.nextInt();
        boolean result = cat.food_procces(food_part);
        if (result) {
            System.out.print("Наелся");
        }else {
            System.out.print("Не наелся");
        }
    }
}
