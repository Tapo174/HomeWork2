package main_classes;

public class kids extends products{
    private final int min_age;
    private final String hypoallergenic;

    public kids(String name, double price, int amount, String unit, int min_age, String hypoallergenic){
        super(name, price, amount, unit);
        this.min_age = min_age;
        this.hypoallergenic = hypoallergenic;
    }

    @Override
    public String toString() {
        return String.format("%s\nminimal age: %s \nhypoallergenic: %s", super.toString(), this.min_age, this.hypoallergenic);
    }
}
