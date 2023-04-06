package Зоопарк.presentrers;

import Зоопарк.The_zoo.zoo;
import Зоопарк.all_animals.birds.hen;
import Зоопарк.all_animals.birds.stork;
import Зоопарк.all_animals.main.animals;
import Зоопарк.all_animals.pets.cat;
import Зоопарк.all_animals.pets.dog;
import Зоопарк.all_animals.wilds.tiger;
import Зоопарк.all_animals.wilds.wolf;
import Зоопарк.messages.msg;
import Зоопарк.views.view;

public class presenter {
    private view view;
    private zoo zoo;

    public presenter(view view, zoo zoo) {
        this.view = view;
        this.zoo = zoo;
    }

    public void Run() {
        this.view.Welcome();
        while (true) {
            this.view.MainMenu();
            int cmd = view.getInt(msg.getIndexlMsg);
            switch (cmd) {
                case 0:
                    this.view.Bye();
                    return;
                case 1:
                    animals animal = getAnimal();
                    if (animal != null) {
                        this.zoo.addAnimal(animal);
                        view.AddedAnimalMsg();
                    }
                    continue;
                case 2, 3, 4, 5, 6, 7, 8, 9:
                    if (this.zoo.isEmpty()) {
                        this.view.PrintZooEmpty();
                        continue;
                    }
                    break;
                default:
                    this.view.NotImplemented();
                    continue;
            }

            switch (cmd) {
                case 4:
                    this.view.PrintAnimals(this.zoo.getAnimals());
                    continue;
                case 6:
                    this.view.SoundAnimals(this.zoo.getAnimals());
                    continue;
                default:
                    break;
            }

            int animalIndex = view.getInt(msg.getAnimalIDMsg);
            if (animalIndex < 0 || animalIndex >= this.zoo.getAnimals().size()) {
                this.view.BadIndex();
                continue;
            }

            animals animal = this.zoo.getAnimal(animalIndex);
            switch (cmd) {
                case 2:
                    this.zoo.removeAnimal(animalIndex);
                    view.RemovedAnimalMsg();
                    break;
                case 3:
                    this.view.PrintAnimal(animal);
                    break;
                case 5:
                    this.view.SoundAnimal(animal);
                    break;
                case 7:
                    this.view.FlyAnimal(animal);
                    break;
                case 8:
                    this.view.PetAnimal(animal);
                    break;
                case 9:
                    this.view.TrainAnimal(animal);
                    break;
                default:
                    break;
            }
        }
    }

    private animals getAnimal() {
        view.NewAnimalMsg();
        int animalType = view.getInt(msg.askAnimalClassMsg);
        double height = view.getDouble(msg.askAnimalHeightMsg);
        double weight = view.getDouble(msg.askAnimalWeightMsg);
        String eyeColor = view.getString(msg.askAnimalEyeColorMsg);
        switch (animalType) {
            case 1, 2:
                String name = view.getString(msg.askPetNameMsg);
                String breed = view.getString(msg.askPetBreedMsg);
                String vaccination = view.getString(msg.askPetVaccinationsMsg);
                String furColor = view.getString(msg.askPetFurColorMsg);
                String bDay = view.getString(msg.askPetBirthDaterMsg);
                if (animalType == 1){
                    return new cat(height, weight, eyeColor, name, breed, vaccination, furColor, bDay);
                }
                boolean trained = view.getBoolean(msg.askIsDogTrainedMsg);
                    return new dog(height, weight, eyeColor, name, breed, vaccination, furColor, bDay, trained);
            case 3, 4:
                String place = view.getString(msg.askWildAnimalHabitatMsg);
                String date = view.getString(msg.askWildAnimalFoundDateMsg);
                if (animalType == 3) {
                    return new tiger(height, weight, eyeColor, place, date);
                }
                boolean leader = view.getBoolean(msg.askIsWolfLeaderdMsg);
                return new wolf(height, weight, eyeColor, place, date, leader);
            case 5, 6:
                if (animalType == 5) {
                    return new hen(height, weight, eyeColor);
                }
                int flyingHeight = view.getInt(msg.askBirdFlightAltitudeMsg);
                return new stork(height, weight, eyeColor, flyingHeight);
            default:
                view.NotImplemented();
                return null;
        }
    }
}
