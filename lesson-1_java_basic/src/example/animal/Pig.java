package example.animal;

import example.product.Meat;
import example.product.Product;

import java.util.Random;

public class Pig implements Animal {
    private int volume = new Random().nextInt(13) + 2;
    private String name;

    public Pig() {
        name = "безымянная";
    }

    public Pig(String name) {
        this.name = name;
    }

    @Override
    public void makeSound() {
        System.out.println("Хрю-хрю");
    }

    @Override
    public Product getProduct() {
        return new Meat(volume);
    }

    @Override
    public String toString() {
        return "Свинья со скромным именем " + name;
    }
}
