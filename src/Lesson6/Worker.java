package Lesson6;

public class Worker implements PrintJob {
     private final  String name = "Ivanov Ivan";
    private final char sex = 'M';
    private final String title_job = "Worker";

    public Worker()
    {
    }

    @Override
    public void printJobTitle() {
        System.out.println("Job title" +name+ "is: " + title_job);
    }
}
