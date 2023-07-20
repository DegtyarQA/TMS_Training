package Lesson6.Doctype1;

import Lesson6.Documents.DocumentAll;

import java.util.Date;

public class ProductContract extends DocumentAll {
    private String type_product;
    private int quantity;

    public ProductContract()
    {
    }
    public ProductContract(String number, Date date, int type, String type_product, int quantity) {
        super(number, date, type);
        this.type_product = type_product;
        this.quantity = quantity;
    }

    public String getType_product() {
        return type_product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setType_product(String type_product) {
        this.type_product = type_product;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "ProductContract{" +
                "type_product='" + type_product + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
