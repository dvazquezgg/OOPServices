package services;

// services.ProductService.java
public class ProductService extends BaseService {
    public ProductService(String name, String description) {
        super(name, description);
    }

    public void startService() {
        System.out.println(getName() + " service started.");
    }

    public void stopService() {
        System.out.println(getName() + " service stopped.");
    }

    public void createProduct() {
        // code to create a new product
    }

    public void updateProduct() {
        // code to update an existing product
    }
}