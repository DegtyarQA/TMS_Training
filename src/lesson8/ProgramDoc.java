package lesson8;

import java.util.Scanner;

public class ProgramDoc {
    public static void main(String[] args) {
        String str1 = new String();
        Scanner s1 = new Scanner(System.in);
        System.out.print("Enter number of document: ");
        str1 = s1.next();
        if (str1.length() != 22) {
            System.out.println("Incorrect input");
        } else {
            HelperMethods.blockNumberOut(str1);
            HelperMethods.hideLetters(str1);
            HelperMethods.formatLetterOut(str1);
            HelperMethods.intoStringABC(str1);
            HelperMethods.startString(str1);
            HelperMethods.endString(str1);
        }
    }
}