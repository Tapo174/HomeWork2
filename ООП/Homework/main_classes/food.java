package main_classes;

public class food extends products {
    private final String exp_date;

    public food(String name, double price, int amount, String unit, String exp_date){
        super(name, price, amount, unit);
        this.exp_date = exp_date;
    }
    @Override
    public String toString() {
        return String.format("%s\nexpiration date: %s", super.toString(), this.exp_date);
    }
}
