package all_animals;

public class stork extends birds {

    protected stork(int height, int weight, String eyes_color, int flight_altitude) {
        super(height, weight, eyes_color, flight_altitude);
    }

    public void fly() {
        String.format("%sВысота полёта: %d метров", super.flight_altitude);
    }

    public void voice() {
        System.out.println("\nЧик-чик-чик(?)");
    }

    public String toString(){
        return String.format("%s \nАист: %s", super.toString());
    }
    
}
