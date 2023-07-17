package Lesson5;

public class Therapist extends Doctor {

    private String cvalification;

    public Therapist()
    {
    }
    public Therapist(String name, String specialization, String cvalification) {
        super(name, specialization);
        this.cvalification = cvalification;
    }

    public void addHealth(){
        System.out.println("Лечит терапевт");
    }
}