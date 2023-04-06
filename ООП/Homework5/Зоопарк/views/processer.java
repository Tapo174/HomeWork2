package Зоопарк.views;
import java.util.List;
import Зоопарк.all_animals.main.animals;;

public interface processer {
    
    public void PrintAnimal(animals animal);

    public void PrintAnimals(List<animals> animals);

    public void SoundAnimal(animals animal);

    public void SoundAnimals(List<animals> animals);

    public void FlyAnimal(animals animal);

    public void PetAnimal(animals animal);

    public void TrainAnimal(animals animal);
}