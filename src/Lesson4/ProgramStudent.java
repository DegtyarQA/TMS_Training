package Lesson4;

import java.util.Arrays;
import java.util.Scanner;

public class ProgramStudent {
    public static void main(String[] args) {
        String names[] = new String[]{"Tom", "Mike", "Rod", "Kate", "Jack", "Victor", "Daniel", "Klark", "Dima", "Oleg", "Yury", "Olga", "Miha", "Ihar"};
        Student[] students = new Student[14];
        for (int i = 0; i < students.length; i++) {
            students[i] = new Student();
            Scanner s1 = new Scanner(System.in);
            students[i].name = names[i];
            System.out.print(students[i].name + " " + students[i].grade + " ;");
        }
        System.out.println();
        for (int j = 0; j < students.length; j++) {
            if (students[j].grade >= 9) {
                students[j].studentInfo();
            }
        }
    }
}