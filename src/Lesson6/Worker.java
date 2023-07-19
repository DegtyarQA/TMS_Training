package Lesson6;

public class Worker implements PrintJob {
    final  String name = "Ivanov Ivan";
    final char sex = 'M';
    final String title_job = "Worker";

    public Worker()
    {
    }

    @Override
    public void printJobTitle() {
        System.out.println("Job title" +name+ "is: " + title_job);
    }
}
