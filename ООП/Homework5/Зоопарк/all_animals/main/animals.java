package Зоопарк.all_animals.main;

public abstract class animals {

    private double height;
    private double weight;
    private String eyeColor;

    protected animals(double height, double weight, String eyeColor) {
        
        this.height = height;
        this.weight = weight;
        this.eyeColor = eyeColor;
    }
    public double getHeight() {
        return this.height;
    }
    public double getWeight() {
        return this.weight;
    }
    public String getEyeColor() {
        return this.eyeColor;
    }
    public abstract String sound();

    public String toString() {
        return String.format("Height: %.1f, Height: %.1f, Eye color: %s", this.getHeight(), this.getWeight(), this.getEyeColor());
    }
}
