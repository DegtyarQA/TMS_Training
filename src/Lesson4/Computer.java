
package Lesson4;

public class Computer {
    float price;
    String model;
    Ram Ram;
    Hdd Hdd;

    public Computer(float price, String model) {
        this.price = price;
        this.model = model;
        this.Ram = new Ram();
        this.Hdd = new Hdd();
    }

    public Computer(float price, String model, Lesson4.Ram ram, Lesson4.Hdd hdd) {
        this.price = price;
        this.model = model;
        Ram = ram;
        Hdd = hdd;
    }
    @Override
    public String toString() {
        return "Computer{" +
                "price=" + price +
                ", model='" + model + '\'' +
                ", Ram=" + Ram +
                ", Hdd=" + Hdd +
                '}';
    }

    void infoCompFull() {
        System.out.println("#################");
        System.out.println(toString());
        System.out.println("#################");
    }
}

