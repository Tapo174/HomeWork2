package Зоопарк.all_animals.wilds;

import Зоопарк.all_animals.main.animals;

public abstract class wild extends animals{

    private String date;
    private String place;

    protected wild(double height, double weight, String eyeColor, String date, String place) {
        super(height, weight, eyeColor);
        this.date = date;
        this.place = place;
    }
    public String getPlace() {
        return this.place;
    }
    public String getDate() {
        return this.date;
    }
    public String toString() {
        return String.format(
            "%s, Habitat: %s, Found date: %s",
            super.toString(), this.getPlace(), this.getDate()
        );
    }
    
}
