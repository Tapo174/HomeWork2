public abstract class polygon extends figures implements perimeter{

    protected double [] sides; 

    protected polygon(double [] sides){
        this.sides = sides;
    }

    public double get_perimeter(){
        double result = (double) 0;
        for (double side : this.sides){
            result += side;
        }
        return result;
    }

    abstract double area();
}
