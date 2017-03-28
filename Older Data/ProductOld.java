package sample;

/**
 * Created by dbarnett on 3/8/2017.
 */

public class ProductOld {


    private String name;
    private double price;
    private int quantity;

    public ProductOld() {
        this.name = "";
        this.price = 0;
        this.quantity = 0;
    }

    public ProductOld(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}

