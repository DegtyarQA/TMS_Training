package Lesson6;

public abstract class Figure {
    double s;
    double p;

    public Figure()
    {
    }

    public Figure(double s, double p) {
        this.s = s;
        this.p = p;
    }

    abstract double  scuareCalculation();
    abstract double perimetrCalculation();
}


