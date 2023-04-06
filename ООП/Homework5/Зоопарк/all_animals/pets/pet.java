package Зоопарк.all_animals.pets;
import Зоопарк.all_animals.main.animals;

public abstract class pet extends animals{
    private String name;
    private String breed;
    private String vaccination;
    private String furColor;
    private String bDay;

    public pet(double height, double weight, String eyeColor, String name, String breed, String vaccinations, String furColor, String bDay) {
        super(height, weight, eyeColor);
        this.name = name;
        this.breed = breed;
        this.vaccination = vaccinations;
        this.furColor = furColor;
        this.bDay = bDay;
    }

    public String getName() {
        return this.name;
    }

    public String getBreed() {
        return this.breed;
    }

    public String getVaccination() {
        return this.vaccination;
    }

    public String getFurColor() {
        return this.furColor;
    }

    public String getBDay() {
        return this.bDay;
    }
    public String Pet() {
        return String.format("=^_^=)");
    }

    @Override
    public String toString() {
        return String.format(
            "%s, Name: %s, Breed: %s, Vaccinations: %s, Fur color: %s, Birth date: %s",
            super.toString(), this.getName(), this.getBreed(), this.getVaccination(), this.getFurColor(), this.getBDay()
        );
    }
}