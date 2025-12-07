package sprint01.Exceptions01.level01A;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sale {
    private final List<Product> products = new ArrayList<>();
    private double total;

    public void addProduct(Product product) {
        if (product == null) {
            throw new IllegalArgumentException("The product cannot be null");
        }
        products.add(product);
    }

    public List<Product> getProducts() {
        return Collections.unmodifiableList(products);
    }

    public double getTotal() {
        return total;
    }

    public void calculateTotal() throws EmptySaleException {
        if (products.isEmpty()) {
            throw new EmptySaleException();
        }


        this.total = products.stream()
                .mapToDouble(Product::getPrice)
                .sum();
    }
}
