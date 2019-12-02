package example;

import example.animal.Animal;
import example.product.Product;

import java.util.ArrayList;
import java.util.List;

public class Farm {
    List<Animal> animalList = new ArrayList<>();

    public void addAnimal(Animal animal) {
        animalList.add(animal);
        animal.makeSound();
    }

    public List<Product> getProduction() {
        List<Product> products = new ArrayList<>();
        for (Animal animal : animalList) {
            Product product = animal.getProduct();
            System.out.println(animal + " принесла нам " + product);
            products.add(product);
        }
        return products;
    }
}
