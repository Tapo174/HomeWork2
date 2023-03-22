public class triangle extends polygon{

    public String name;

    public triangle (String name, double a, double b, double c){
        super(new double[]{a, b, c});
        this.name = name;
    }

    protected triangle(double[] sides) {
        super(sides);
    }

    double area() {
        double p = super.get_perimeter() / 2;
        return Math.sqrt(p * (p - sides[0]) * (p - sides[1]) * (p - sides[1]));
    }

    public double get_perimeter(){
        return super.get_perimeter();
    }

    public String toString() {
        return String.format("%s Имеет площадь %f; \nПериметр %f \nСтороны %f %f %f", name, area(), get_perimeter(), super.sides[0], super.sides[1], super.sides[2]);
    }
}
