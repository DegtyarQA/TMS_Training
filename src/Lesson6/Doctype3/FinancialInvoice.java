package Lesson6.Doctype3;

import Lesson6.Documents.DocumentAll;

import java.util.Date;

public class FinancialInvoice extends DocumentAll {
    private float summ;

    public FinancialInvoice()
    {
    }
    public FinancialInvoice(String number, Date date, int type, float summ) {
        super(number, date, type);
        this.summ = summ;
    }


}
