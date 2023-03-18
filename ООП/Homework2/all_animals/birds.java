package all_animals;
public abstract class birds extends animal implements flying{
    protected int flight_altitude;

    public int flyght_height(){
        return this.flight_altitude;
    }

    protected birds(int height, int weight, String eyes_color, int flight_altitude) {
        super(height, weight, eyes_color);
        this.flight_altitude = flight_altitude;
    }
    
    public abstract void fly();
}
