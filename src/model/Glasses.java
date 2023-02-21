package model;

public class Glasses extends BaseProduct {

    String brand;
    public Glasses(double price, int quantity) {
        super(price, quantity);
    }

    public Glasses(String brand, double price, int quantity) {
        super(price, quantity);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return super.toString();
    }


}
