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

    public double getS() {
        return s;
    }

    public double getP() {
        return p;
    }

    public void setS(double s) {
        this.s = s;
    }

    public void setP(double p) {
        this.p = p;
    }
}



