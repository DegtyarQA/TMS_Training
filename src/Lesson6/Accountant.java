package Lesson6;

public class Accountant implements PrintJob {
    final  String name = "Frolov Andrei";
    final String job_title = "Accountant";

    public Accountant()
    {
    }

    @Override
    public void printJobTitle() {
        System.out.println("Job title" + " " + name + " " + "is: " + job_title);
    }
}
