package example.product;

public class Milk implements Product {
    private int volume;

    public Milk(int volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return String.format("Молоко %d литров", volume);
    }
}
