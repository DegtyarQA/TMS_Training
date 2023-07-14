
package Lesson4;

import javax.xml.namespace.QName;

public class Ram {
    String name;
    int volume;

    public Ram() {
    }

    public Ram(String name, int volume) {
        this.name = name;
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Ram{" +
                "name='" + name + '\'' +
                ", volume=" + volume +
                '}';
    }
    public  void  DdrInfo(){
        System.out.println(this.toString());
    }
}