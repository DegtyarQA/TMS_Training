package Lesson5;

public class Doctor {
    private String name;
    private String specialization;

    public Doctor() {
    }
    public Doctor(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;
    }
    public void addHealth(){
        System.out.println("Если вы видите это сообщение - программа работает некорректно");
    }
}
