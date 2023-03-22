public class circle extends figures implements getCircle {
    
    private String name;
    private double radius;

    public circle(String name, double radius){
        this.name = name;
        this.radius = radius;
    }

    double area() {
        return Math.PI * (radius * radius);
    }

    public double get_radius() {
        return radius;
    }

    public double ring() {
        return Math.PI * (radius * 2);
    }
    
    public String toString(){
        return String.format("%s Имеет площадь: %f \nРадиус: %f \nОкружность: %f", name, area(), radius, ring());
    }
}