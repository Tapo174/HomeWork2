package Зоопарк.The_zoo;

import java.util.List;
import Зоопарк.all_animals.main.animals;
import java.util.ArrayList;

public class zoo {
    private List<animals> animals;

    public zoo(List<animals> animals){
        this.animals = animals;
    }
    public zoo() {
        this.animals = new ArrayList<animals>();
    }
    public List<animals> getAnimals() {
        return this.animals;
    }
    public animals getAnimal(int idx) {
        return this.animals.get(idx);
    }
    public void addAnimal(animals animal) {
        this.animals.add(animal);
    }
    public void removeAnimal(int idx) {
        this.animals.remove(idx);
    }
    public boolean isEmpty() {
        return this.getAnimals().size() == 0;
    }
}