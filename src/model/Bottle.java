package model;

public class Bottle extends BaseProduct {

    double capacity;
    public Bottle(double price, int quantity) {
        super(price, quantity);
    }

    public Bottle(double capacityOfBottle, double price, int quantity) {
        super(price, quantity);
        this.capacity = capacityOfBottle;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Bottle{" +
                "capacity=" + capacity +
                '}';
    }


    public int compareTo(Bottle other) {
        if (this.capacity > other.capacity) {
            return 1;
        } else if (this.capacity < other.capacity) {
            return -1;
        } else {
            return super.compareTo(other);
        }

    }
}

