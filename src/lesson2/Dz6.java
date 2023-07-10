package lesson2;

public class Dz6 {
    public static void main(String[] args) {
        int i;
        double z;
        for (i = 1; i <= 99; i++) {
            z = i % 2;
            if (z != 0) {
                System.out.println(i);
            }
        }
    }
}
