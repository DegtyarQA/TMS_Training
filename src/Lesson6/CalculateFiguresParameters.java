package Lesson6;
/*обоснование архитектурного решения: Посмотрел исходя из задания что общего между фигурами в части параметров, как оказалось
геометрические параметры каждой фигуры несут разную смысловую нагрузку, поэтому проще их описать для класса каждой из фигур.
Итого общего: площадь и периметр, т.к будем считать для каждой. По идее можно было бы реализовать через интерфейс, а эти два параметра описать
опять же в каждом из классов, но в задании нужен массив объектов, а его удобнее реализовать через абстрактный класс
 */

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
