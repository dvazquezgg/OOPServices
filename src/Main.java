import data.CSVFileReader;
import model.Bottle;
import model.Glasses;
import model.Person;
import model.Product;
import util.IBIO;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        System.out.println("OOP Services");

        Product product = new Glasses("Ray-Ban", 100, 10);
        Glasses glasses = new Glasses("Ray-Ban", 80, 5);
        Product anotherProduct = new Bottle(10, 10);
        Bottle bottle = new Bottle(1.5,8, 5);

        Product[] bunchOfProducts = new Product[4];
        bunchOfProducts[0] = product;
        bunchOfProducts[1] = glasses;
        bunchOfProducts[2] = anotherProduct;
        bunchOfProducts[3] = bottle;

        for (Product p : bunchOfProducts) {
            System.out.println(p);
            if(p instanceof Bottle){
                Bottle b = (Bottle) p;
                System.out.println("Capacity: " + b.getCapacity());
            } else if(p instanceof Glasses){
                Glasses g = (Glasses) p;
                System.out.println("Brand: " + g.getBrand());
            }
        }
        IBIO.output("Compare glasses to bottle: ");
        IBIO.output(glasses.compareTo(bottle));

        IBIO.output("Compare bottle to bottle: ");
        IBIO.output(bottle.compareTo((Bottle) anotherProduct));

    }

    private static ArrayList<Person> loadPersons() {
        ArrayList<Person> persons = new ArrayList<>();


        return persons;
    }

}
