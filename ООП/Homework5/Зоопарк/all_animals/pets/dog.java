package Зоопарк.all_animals.pets;


public class dog extends pet{
    protected boolean trained;

    public dog(double height, double weight, String eyeColor, String name, String breed, String vaccination, String furColor, String bDay, boolean trained) {
        super(height, weight, eyeColor, name, breed, vaccination, furColor, bDay);
        this.trained = trained;
    }
    public dog(double height, double weight, String eyeColor, String name, String breed, String vaccination, String furColor, String bDay) {
        super(height, weight, eyeColor, name, breed, vaccination, furColor, bDay);
        this.trained = false;
    }
    public boolean isTrained() {
        return this.trained;
    }
    public String train() {
        this.trained = true;
        return String.format("The dog %s was trained successfully\n", this.getName());
    }
    public String sound() {
        return "Гав-Гав!";
    }
    public String toString() {
        return String.format("Dog (%s, is trained: %b)", super.toString(), this.isTrained());
    }
}