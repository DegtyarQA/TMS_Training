
package Lesson4;

public class Hdd {
    String name;
    int volume;
    String type;

    public Hdd() {
    }

    public Hdd(String name, int volume, String type) {
        this.name = name;
        this.volume = volume;
        this.type = type;
    }

    public void HddInfo() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Hdd{" +
                "name='" + name + '\'' +
                ", volume=" + volume +
                ", type='" + type + '\'' +
                '}';
    }
}


