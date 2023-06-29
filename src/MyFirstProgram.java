import java.util.Scanner;

public class MyFirstProgram {
    public static void main(String[] args) {
        String name;
        Scanner scan = new Scanner(System.in);
        System.out.print("Please you name!:");
        name = scan.next();
        System.out.println("Hello" + " " + name + " " + "Its's a good work");
    }
}