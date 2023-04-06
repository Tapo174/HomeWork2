package Зоопарк.all_animals.birds;

public class stork extends flying{
    public stork(double height, double weight, String eyeColor, int flyingHeigh) {
        super(height, weight, eyeColor,flyingHeigh);
    }

    public stork(double height, double weight, String eyeColor) {
        super(height, weight, eyeColor);
    }

    public String sound() {
        return "чик-чик-чик";
    }

    public String toString() {
        return String.format("Stork (%s)", super.toString());
    }
}