package Lesson5;

public class Surgeon extends Doctor {
    private boolean doOperating;
    private String type;
    public Surgeon() {
    }

    public Surgeon(String name, String specialization, boolean doOperating, String type) {
        super(name, specialization);
        this.doOperating = doOperating;
        this.type = type;
    }
    public void addHealth(){
        System.out.println("Лечит хирург");
    }
}
