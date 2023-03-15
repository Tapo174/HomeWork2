package classes;
import main_classes.hygiene;

public class toilet_paper  extends hygiene{
    private final int layers;

    public toilet_paper(String name, double price, int amount, String unit, int sum, int layers) {
        super(name, price, amount, unit, sum);
        this.layers = layers;
    }
    public String toString(){
        return String.format("%s Layers: %s", super.toString(), this.layers);
    }
}