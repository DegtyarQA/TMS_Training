package Lesson6.Documents;

import java.util.Date;

public abstract class DocumentAll {
    private String number;
    private Date date;
    private int type;

    public DocumentAll()
    {
    }

    public DocumentAll(String number, Date date, int type) {
        this.number = number;
        this.date = date;
        this.type = type;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getNumber() {
        return number;
    }

    public Date getDate() {
        return date;
    }

    public int getType() {
        return type;
    }

    @Override
    public String toString() {
        return "DocumentAll{" +
                "number='" + number + '\'' +
                ", date=" + date +
                ", type=" + type +
                '}';
    }
}
