package Lesson6;

public class Director implements PrintJob {
    private final String name = "Petrov Kolya";
    private final String job_title = "Director";

    public Director()
    {
    }

    @Override
    public void printJobTitle() {
        System.out.println("Job title" + " " + name + " " + "is: " + job_title);
    }
}
