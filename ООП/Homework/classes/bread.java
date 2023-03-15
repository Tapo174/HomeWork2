package classes;
import main_classes.food;
public class bread extends food{
    private final String flour;
    
    public bread(String name, double price, int amount, String unit, String exp_date, String flour){
        super(name, price, amount, unit, exp_date);
        this.flour = flour;
    }
    public String toString(){
        return String.format("%s\nFlour type: %s", super.toString(), this.flour);
    }
}
