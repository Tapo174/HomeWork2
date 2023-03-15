package classes;
import main_classes.food;

public class milk extends food{
    private final double fat_content;

    public milk(String name, double price, int amount, String unit, String exp_date, double fat_content) {
        super(name, price, amount, unit, exp_date);
        this.fat_content = fat_content;
    }
    public String tostString(){
        return String.format("%s Fat content: %s", super.toString(), this.fat_content);
    }
}