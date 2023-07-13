package Lesson4;

import java.util.Random;

public class Student {
    String name;
    int group;
    int grade;

    Random r1 =new Random();
    Student()
    {
     this.group = 14;
     this.grade = r1.nextInt(11);
    }

    void studentInfo() {
        System.out.println("The best:");
        System.out.println(name + " " + "Group: " + group + " " + "Grade: " + grade);
    }
}
