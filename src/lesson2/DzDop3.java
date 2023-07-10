package lesson2;

public class DzDop3 {
    public static void main(String[] args) {
        int a = 2;
        while (a <= 10) {
            for (int i = 1; i <= 10; i++) {
                int z = a * i;
                System.out.println(a + "x" + i + "=" + z);
            }
            a++;
        }
    }
}
