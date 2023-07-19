package Lesson6.Program;

import Lesson6.Doctype1.ProductContract;
import Lesson6.Doctype2.EmployeeContract;
import Lesson6.Doctype3.FinancialInvoice;
import Lesson6.Documents.DocumentAll;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date date = new Date(121212123222L);
        Date end_date = new Date(4324234L);
        Date date0 = new Date(434343434443L);
        Date date1 = new Date(323423L);
        DocumentAll doc1 = new EmployeeContract("OT0101", date, 2, end_date,"Ivan");
        DocumentAll doc2 = new ProductContract("BBD0015", date0, 1, "pharm", 15);
        DocumentAll doc3 = new FinancialInvoice("BL0023", date1, 3, 43434.45f);
        System.out.println(doc1.getDate());
        System.out.println(doc2.getDate());
        System.out.println(doc3.getDate());
    }
}
