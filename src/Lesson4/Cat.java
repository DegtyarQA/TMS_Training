package Lesson4;

public class Cat {
    String name;
    int age;
    int fodd_level;

    boolean food_procces(int food_part) {
        if (fodd_level < food_part) {
            return true;
        } else {
            return false;
        }
    }
}
