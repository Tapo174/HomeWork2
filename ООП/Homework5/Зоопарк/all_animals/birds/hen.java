package Зоопарк.all_animals.birds;

public class hen extends flying{

    public hen(double height, double weight, String eyeColor) {
        super(height, weight, eyeColor);
    }

    public String sound() {
        return String.format("Ко-ко-ко!");
    }

     public String toString() {
        return String.format("Hen (%s)", super.toString());
    }
}
