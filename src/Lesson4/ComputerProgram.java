package Lesson4;

public class ComputerProgram {
    public static void main(String[] args) {
        Computer comp1 = new Computer(33351, "AMD");
        comp1.infoCompFull();
        Ram ram = new Ram("DDR", 256);
        Hdd hdd = new Hdd("Kingston", 1200, "out");
        Computer comp2 = new Computer( 555, "Trolly", ram, hdd);
        comp2.infoCompFull();
         }
}
