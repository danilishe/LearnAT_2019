package example.animal;

import example.product.Product;

public interface Animal {
    default void makeSound() {
        System.out.println("...");
    }

    Product getProduct();
}
