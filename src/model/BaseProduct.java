package model;

public abstract class BaseProduct implements Product {
    private int id;
    private String name;

    private double price;
    private int quantity;

    public BaseProduct(int id, String name, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public BaseProduct(String name, double price, int quantity) {
        //this.id = randomID();
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public BaseProduct(double price, int quantity) {
        this.price = price;
        this.quantity = quantity;
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

    @Override
    public String toString() {
        return "BaseProduct{" +
                "price=" + price +
                ", quantity=" + quantity +
                '}';
    }

    public int compareTo(BaseProduct other) {
        if (this.price > other.price) {
            return 1;
        } else if (this.price < other.price) {
            return -1;
        } else {
            if( this.quantity > other.quantity)
                return 1;
            else if (this.quantity < other.quantity)
                return -1;
            else
                return 0;

        }
    }
}
