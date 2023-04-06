package Зоопарк.views;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import Зоопарк.all_animals.main.animals;
import Зоопарк.interfaces.to_fly;
import Зоопарк.interfaces.to_pet;
import Зоопарк.interfaces.to_train;
import Зоопарк.messages.msg;

public class console implements view {
    private Scanner scan;

    public console(Scanner scan) {
        this.scan = scan;
    }

    public void Welcome() {
        System.out.println(msg.welcomeMsg);

    }

    public void MainMenu() {
        System.out.println(msg.chooseActionsMsg);
        for (int i = 1; i <= msg.mainMenuEntries.size(); i++) {
            System.out.printf("%d - %s\n", i % 10, msg.mainMenuEntries.get(i % 10));
        }
    }

    public void BadIndex() {
        System.out.printf("\n%s\n\n", msg.invalidAnimalIDMsg);
    }

    public void NewAnimalMsg() {
        System.out.printf("\n%s\n", msg.addAnimalMsg);
    }

    public void AddedAnimalMsg() {
        System.out.printf("\n%s\n\n", msg.animalWasAddedMsg);
    }

    public void RemovedAnimalMsg() {
        System.out.printf("\n%s\n\n", msg.animalWasRemovedMsg);
    }

    public void PrintZooEmpty() {
        System.out.printf("\n%s\n\n", msg.nobodyLivesInZooMsg);
    }

    public void PrintAnimal(animals animal) {
        System.out.printf("%s\n\n", animal);

    }

    public void PrintAnimals(List<animals> animals) {
        for (int i = 0; i < animals.size(); i++) {
            System.out.printf("%d - %s\n", i, animals.get(i));
        }
        System.out.println();
    }

    public void SoundAnimal(animals animal) {
        System.out.printf("%s\n\n", animal.sound());

    }

    public void SoundAnimals(List<animals> animals) {
        for (animals animal : animals) {
            SoundAnimal(animal);
        }
    }

    public void FlyAnimal(animals animal) {
        if (animal instanceof to_fly) {
            System.out.println(((to_fly) animal).fly());
        } else {
            System.out.println(msg.cannotFlyMsg);
        }

    }

    public void PetAnimal(animals animal) {
        if (animal instanceof to_pet) {
            System.out.println(((to_pet) animal).pet());
        } else {
            System.out.println(msg.cannotPetMsg);
        }
    }

    public void TrainAnimal(animals animal) {
        if (animal instanceof to_train) {
            System.out.println(((to_train) animal).train());
        } else {
            System.out.println(msg.cannotTrainMsg);
        }
    }

    public void NotImplemented() {
        System.out.printf("\n%s\n\n", msg.notImplementedMsg);
    }

    public void Bye() {
        System.out.println(msg.byeMsg);

    }

    public int getInt(String message) {
        while (true) {
            System.out.print(message);
            if (scan.hasNextInt()) {
                return scan.nextInt();
            }
            System.out.println(msg.incorrectInputMsg);
            scan.next();
        }
    }

    public double getDouble(String message) {
        while (true) {
            System.out.print(message);
            if (scan.hasNextDouble()) {
                return scan.nextDouble();
            }
            System.out.println(msg.incorrectInputMsg);
            scan.next();
        }
    }

    public String getString(String message) {
        System.out.print(message);
        return scan.next();
    }

    public boolean getBoolean(String message) {
        System.out.print(message);
        if (scan.next().toLowerCase() == "y") {
            return true;
        }
        return false;
    }

    public Date getDate(String message) {
        DateFormat parser = new SimpleDateFormat("yyyy-MM-dd");
        while (true) {
            System.out.print(message);
            String strDate = scan.next();
            try {
                return parser.parse(strDate);
            } catch (Exception e) {
                System.out.println(msg.incorrectInputMsg);
            }
        }
    }

    public List<String> getListString(String message) {
        System.out.print(message);
        List<String> result = new ArrayList<String>();
        result.add(scan.next());
        for (String elem : scan.nextLine().split(" ")) {
            if (elem != "") {
                result.add(elem);
            }
        }
        return result;
    }
}