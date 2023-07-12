package lesson3;

import java.util.Arrays;
import java.util.Scanner;

public class L3Zad2 {
    public static void main(String[] args) {
        int array2[] = {1, 66, 88, 45, 32, 3, 88, 12, 88, 98};
        int x;
        Scanner s2 = new Scanner(System.in);
        System.out.print("Enter number: ");
        x = s2.nextInt();
        for (int i = 0; i < array2.length; i++) {
            if (array2[i] == x) {
                array2[i] = 0;
            }
        }
        System.out.print(Arrays.toString(array2));
    }
}
