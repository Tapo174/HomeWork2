package classes;

import main_classes.food;

public class soda extends food{

    public soda(String name, double price, int amount, String unit, String exp_date) {
        super(name, price, amount, unit, exp_date);
    }
    public String toString(){
        return super.toString();
    }
    
}
