package classes;
import main_classes.hygiene;

public class diapers extends hygiene{

    private final String size;
    private final double min_age;
    private final double max_age;
    private final String gender;

 public diapers(String name, double price, int amount, String unit, int sum, String size, double min_age, double max_age,String gender ) {
        super(name, price, amount, unit, sum);
        this.size = size;
        this.min_age = min_age;
        this.max_age = max_age;
        this.gender = gender;
    }
    public String toString(){
        return String.format("%s\nSize: %s\nMin weight: %f\nMax weight: %f\nGender: %s", super.toString(),this.size,this.min_age, this.max_age, this.gender);
    }
}
