package example.animal;

import example.product.Milk;
import example.product.Product;

import java.util.Random;

public class Cow implements Animal {
    private final String name;
    private int volume = new Random().nextInt(13) + 2;

    public Cow() {
        name = "безымянная";
    }

    public Cow(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Корова по имени " + name;
    }

    @Override
    public void makeSound() {
        System.out.println("Муу");
    }

    @Override
    public Product getProduct() {
        Product milk = new Milk(volume);
        volume = 0;
        return milk;
    }
}
