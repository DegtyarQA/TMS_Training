package lesson3;

import java.util.Arrays;
import java.util.Random;

public class L3Zad4 {
    public static void main(String[] args) {
        Random random = new Random();
        int array1[] = new int[5];
        for (int i=0; i<array1.length;i++){
            array1[i] = random.nextInt(100);
        }
        int array2[] = new int[5];
        for (int u=0; u<array2.length;u++){
            array2[u] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        int s1 = 0;
        int s2 = 0;
        for (int i = 0; i < array1.length; i++) {
            s1 = s1 + array1[i];
            s2 = s2 + array2[i];
        }
        if (s1 > s2) {
            System.out.print("Average array1: " + s1 +  " > average array2: " +s2);
        } else if (s1 < s2) {
            System.out.print("Average array2: " + s2 + " > average array1: " + s1);
        } else {
            System.out.print("Average array2: " + s2 + " = average array1: " + s1);
        }
    }
}