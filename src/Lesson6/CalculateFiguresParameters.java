package Lesson6;

public class CalculateFiguresParameters {
    public static void main(String[] args) {
        Figure figure1 = new Circle(7.5);
        Figure figure2 = new Rectangle(12.5, 3.5);
        Figure figure3 = new Triangle(4, 5.5, 8.8);
        Figure[] array = new Figure[3];
        array[0] = figure1;
        array[1] = figure2;
        array[2] = figure3;
        double psumm = 0;
        for (int i = 0; i<array.length; i++) {
            array[i].perimetrCalculation();
            array[i].scuareCalculation();
            psumm = psumm + array[i].p;
            System.out.println(array[i].p);
        }
        System.out.println("Full perimetr: " + psumm);
    }
}
