package sprint01.Exceptions01.level01A;

import java.util.Objects;

public class Product {
    private final String name;
    private final double price;

    public Product(String name, double price) {
        this.name = Objects.requireNonNull(name, "The name cannot be null.");
    if(price < 0) {
        throw  new IllegalArgumentException("The price cannot be negative");
    }

    this.price = price;
    }

    public String getName() {
        return name;

    }

    public double getPrice() {
        return price;
    }
    @Override
    public String toString() {
        return "Product{name= '" + name + "', price=" + price + "}";
    }
}
