package Lesson5;

public class PhoneProgram {
    public static void main(String[] args) {
        //Создаем объекты сетерами
        Phone p1 = new Phone();
        p1.setModel("nokia");
        p1.setNumber("+375291230050");
        p1.setWeight(200f);
        Phone p2 = new Phone();
        p2.setModel("Apple");
        p2.setNumber("+375299874512");
        p2.setWeight(150f);
        Phone p3 = new Phone();
        p3.setModel("Samsung");
        p3.setNumber("+375441479887");
        p3.setWeight(350f);
        p1.PrintInfo();
        p2.PrintInfo();
        p3.PrintInfo();
        p1.receiveCall("Ivan");
        p2.receiveCall("Fedor");
        p3.receiveCall("Oleg");
        p1.getNumber();
        p2.getNumber();
        p3.getNumber();
        //Создаем конструктором, в конструкторе из трех параметров вызываем с двумя
        Phone p4 = new Phone("+375443457654","LG", 145f);
        Phone p5 = new Phone("+375331234321", "Sony", 213f);
        Phone p6 = new Phone("+375447896543", "huawei", 230f);
        p4.receiveCall("Ihar", p1.getNumber());
        p5.receiveCall("Alex", p2.getNumber());
        p6.receiveCall("Maxim", p3.getNumber());
        p1.sendMessage("+375331230050", "+375441230050", "+375331230050", "+375291233333", "+375291236666", "+375291237777", "+375291232222");



    }
}
