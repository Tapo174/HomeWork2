package Зоопарк.all_animals.pets;


public class cat extends pet{

    public cat(double height, double weight, String eyeColor, String name, String breed, String vaccination, String furColor, String bDay) {
        super(height, weight, eyeColor, name, breed, vaccination, furColor, bDay);
    }

    public String sound() {
        return "Meow-meow!";
    }

    public String toString() {
        return String.format("Cat (%s, is woolly: %b)", super.toString());
    }
}