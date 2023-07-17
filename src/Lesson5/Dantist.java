package Lesson5;

public class Dantist extends Doctor {
    private boolean ortoped;
    private int age;
    public Dantist() {
    }

    public Dantist(String name, String specialization, boolean ortoped, int age) {
        super(name, specialization);
        this.ortoped = ortoped;
        this.age = age;
    }

    public void addHealth() {
        System.out.println("Лечит Дантист");
    }
}
