package main_classes;

public class drinks extends products{
    private final double volume;
    
    public drinks(String name, double price, int amount, String unit, double volume){
        super(name, price, amount, unit);
        this.volume = volume;
    }
    @Override
    public String toString() {
        return String.format("%s\nVolume: %s", super.toString(), this.volume);
    }
}
