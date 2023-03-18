package all_animals;

public class hen extends birds{

    protected hen(int height, int weight, String eyes_color, int flight_altitude) {
        super(height, weight, eyes_color, flight_altitude);
    }

    public void fly() {
        String.format("Высота полёта: %d метров", super.flight_altitude);
    }

    public void voice() {
        System.out.println("\nКу-ка-ре-ку");
    }

    public String toString(){
        return String.format("Курица: %s", super.toString());
    }
   
}

