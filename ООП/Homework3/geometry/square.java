public class square extends polygon{

    private String name;

    public square(String name, double a){
        super(new double[] {a, a, a, a});
        this.name = name;
    }

    public double get_perimeter() {
        return super.get_perimeter();
    }

    double area() {
        return sides[0] * sides[1];
    }
    
    public String toString() {
        return String.format("%s Имеет площадь %f \nПериметр %f \nРавные стороны %f", name, area(), get_perimeter(), sides[0]);
    }
}