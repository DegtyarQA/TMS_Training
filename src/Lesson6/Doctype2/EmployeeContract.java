package Lesson6.Doctype2;

import Lesson6.Documents.DocumentAll;

import java.util.Date;

public class EmployeeContract extends DocumentAll {
    private Date end_date;
    private String name;

    public EmployeeContract()
    {
    }

    public EmployeeContract(String number, Date date, int type, Date end_date, String name) {
        super(number, date, type);
        this.end_date = end_date;
        this.name = name;
    }

    public Date getEnd_date() {
        return end_date;
    }

    public String getName() {
        return name;
    }

    public void setEnd_date(Date end_date) {
        this.end_date = end_date;
    }

    public void setName(String name) {
        this.name = name;
    }
}


