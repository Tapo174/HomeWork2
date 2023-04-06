package Зоопарк.all_animals.wilds;

public class tiger extends wild{

    public tiger(double height, double weight, String eyeColor, String date, String place) {
        super(height, weight, eyeColor, date, place);
    }

    public String sound() {
        return "РррРР";
    }
    public String toString() {
        return String.format("Tiger (%s)", super.toString());
    }
}
