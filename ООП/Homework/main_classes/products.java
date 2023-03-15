package main_classes;

public class products {
    private String name;
    private double price;
    private int amount;
    private String unit;

    public products(String name, double price, int amount, String unit){
        this.name = name;
        this.price = price;
        this.amount = amount;
        this.unit = unit;
    }
    public products(){}

    public String toString(){
        return String.format("Name: %s\nPrice: %.2f\namount: %d\nunit: %s", this.name, this.price, this.amount, this.unit);
    }
}
