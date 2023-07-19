package Lesson6;

public class Circle extends Figure {
    final double pi = 3.1415926536;
    double r;

    public Circle(double r) {
        this.r = r;
    }
    @Override
    public double scuareCalculation() {
        this.s = pi * Math.pow(this.r,2);
        return s;
    }

    @Override
    public double perimetrCalculation() {
        p = 2 * pi * this.r;
        return p;
    }
}
