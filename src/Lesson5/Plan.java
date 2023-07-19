package Lesson5;

public class Plan {
    int code;
    String personalDoctor;

    public Plan() {
    }

    public Plan(int code) {
        this.code = code;
    }
    public int asigneeDctor() {
        if (this.code == 1) {
            personalDoctor = "Назначен Хирург";
            System.out.println(personalDoctor);
            return (this.code);
        } else if (this.code == 2) {
            personalDoctor = "Назначен Дантист";
            System.out.println(personalDoctor);
            return (this.code);
        } else {
            personalDoctor = "Назначен Терапевт";
            System.out.println(personalDoctor);
            return (this.code);
        }
    }
}
