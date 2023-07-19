package Lesson6;

import static java.lang.Math.sqrt;

public class Triangle extends Figure {
    private double a;
    private double b;
    private double c;
    private double h;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double HeightCalc(){
        double semiperimetr = (a + b + c)/2;
        h = (2*sqrt(semiperimetr*(semiperimetr-a)*(semiperimetr-b)*(semiperimetr-c)))/a;
        return(h);
    }

    @Override
    public double scuareCalculation() {
        s= (this.a * h)/2;
        return(s);
    }

    @Override
    public double perimetrCalculation() {
        p = a + b + c;
        return(p);
    }
}
