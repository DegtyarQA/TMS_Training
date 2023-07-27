package Lesson6;

public class ProgramJob {
    public static void main(String[] args) {
        Worker worker = new Worker();
        worker.printJobTitle();
        Director director = new Director();
        director.printJobTitle();
        Accountant accountant = new Accountant();
        accountant.printJobTitle();
    }
}
