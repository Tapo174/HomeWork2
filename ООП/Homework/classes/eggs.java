package classes;
import main_classes.food;

public class eggs extends food{
      private final int sum;

    public eggs(String name, double price, int amount, String unit, String exp_date, int sum) {
        super(name, price, amount, unit, exp_date);
        this.sum = sum;
    }

    public String toString(){
        return String.format("%s\namount in pack: %s", super.toString(),this.sum);
    }
  
    
}
