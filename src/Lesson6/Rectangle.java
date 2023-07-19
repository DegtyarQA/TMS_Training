package Lesson6;

public class Rectangle extends Figure {
    double a;
    double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double scuareCalculation() {
        s = a * b;
        return s;
    }

    @Override
    public double perimetrCalculation() {
        p = (a + b)*2;
        return p;
    }
}
