package example.product;

public class Meat implements Product {
    private final int volume;

    public Meat(int volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return String.format("Мясо %d кг", volume);
    }
}
