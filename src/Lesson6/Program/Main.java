package Lesson6.Program;

import Lesson6.Doctype1.ProductContract;
import Lesson6.Doctype2.EmployeeContract;
import Lesson6.Doctype3.FinancialInvoice;
import Lesson6.Documents.DocumentAll;
import Lesson6.Registr.Registr;

import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Date date = new Date(121212123222L);
        Date end_date = new Date(4324234L);
        Date date0 = new Date(434343434443L);
        Date date1 = new Date(323423L);
        DocumentAll doc1 = new EmployeeContract("OT0101", date, 2, end_date,"Ivan");
        DocumentAll doc2 = new ProductContract("BBD0015", date0, 1, "pharm", 15);
        DocumentAll doc3 = new FinancialInvoice("BL0023", date1, 3, 43434.45f);
        Registr registr = new Registr();
        registr.addToRegister(doc1);
        registr.addToRegister(doc2);
        registr.addToRegister(doc3);
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter docnumber: ");
        int docnum = s1.nextInt();
        registr.infoDoc(docnum);


    }
}
