public class rectangle extends polygon{

    private String name;

    protected rectangle(String name, double a, double b) {
        super(new double[]{a, b});
        this.name = name;
    }

    double area() {
        return sides[0] * sides[1];
    }
    
    public double get_perimeter(){
        return super.get_perimeter();
    }

    public String toString(){
        return String.format("%s Имеет Площадь %f; \nПериметр %f; \nСтороны %f %f", name, area(), get_perimeter(), sides[0], sides[1]);
    }
}