package Lesson5;


public class Ambulance {
    public static void main(String[] args) {
        Surgeon surgeon = new Surgeon("Victor", "Surgeon", true, "abdominal");
        Therapist therapist = new Therapist("Alex", "Therapist", "hight");
        Dantist dantist = new Dantist("Nick", "Dantist", true, 55);
        Pacient pacient = new Pacient("Olga", 44, "F");
        Plan plan = new Plan(6);
        plan.asigneeDctor();
        if (plan.code == 2){
            dantist.addHealth();
        } else if (plan.code==1) {
            surgeon.addHealth();
        }else therapist.addHealth();
    }
}