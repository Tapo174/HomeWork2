package main_classes;

public class hygiene extends products{
    private final int sum;
    
    public hygiene(String name, double price, int amount, String unit, int sum){
        super(name, price, amount, unit);
        this.sum = sum;
    }
    @Override
    public String toString() {
        return String.format("%s\namount in pack: %s", super.toString(), this.sum);
    }
}
