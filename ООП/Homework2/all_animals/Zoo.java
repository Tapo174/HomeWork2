package all_animals;
import java.util.ArrayList;
import java.util.Scanner;

public class Zoo {
    public static ArrayList<animal> all_animals = new ArrayList<>();
    { 
    all_animals.add(new cat("Серик", "Метис", "Есть", "Неизвестно", 23, 3, "Зелёный", "Серый"));
    all_animals.add(new dog("Шарик", "Дворняга", "Есть", "Черный", "Неизвестно", 60, 8, "Карий", "Да"));
    all_animals.add(new tiger(130, 200, "Жёлтый", "Приморский край", "15.03.2023"));
    all_animals.add(new wolf(100, 50, "Голубой", "Тундра", "15.03.2023", "Да"));
    all_animals.add(new hen(30, 1, "Карий", 200));
    all_animals.add(new stork(100, 4, "Черный", 2000));
    }

    public int size(){
        return all_animals.size();
    }

    public void cat_add(Scanner input){
        String name; String breed; String vaccination; String Bday; int height; int weight; String eyes_color; String coat_color;
        System.out.println("Введите имя: ");
        name = input.next();
        System.out.println("Введите породу: ");
        breed = input.next();
        System.out.println("Наличие вакцинации: ");
        vaccination = input.next();
        System.out.println("Введите дату рождения: ");
        Bday = input.next();
        System.out.println("Введите рост: ");
        height = input.nextInt();
        System.out.println("Введите вес: ");
        weight = input.nextInt();
        System.out.println("Введите цвет глаз: ");
        eyes_color = input.next();
        System.out.println("Введите окрас шерсти: ");
        coat_color = input.next();

        all_animals.add(new cat(name, breed, vaccination, Bday, height, weight, eyes_color, coat_color));
    }

    public void dog_add(Scanner input){
        String name; String breed; String vaccination; String Bday; int height; int weight; String eyes_color; String train;
        System.out.println("Введите имя: ");
        name = input.next();
        System.out.println("Введите породу: ");
        breed = input.next();
        System.out.println("Наличие вакцинации: ");
        vaccination = input.next();
        System.out.println("Введите дату рождения: ");
        Bday = input.next();
        System.out.println("Введите рост: ");
        height = input.nextInt();
        System.out.println("Введите вес: ");
        weight = input.nextInt();
        System.out.println("Введите цвет глаз: ");
        eyes_color = input.next();
        System.out.println("Наличие дрессировки: ");
        train = input.next();

        all_animals.add(new dog(name, breed, vaccination, eyes_color, Bday, height, weight, eyes_color, train));
    }

    public void wolf_add(Scanner input){
        int height; int weight; String eyes_color; String inhabitancy; String date; String pack_leader;
        System.out.println("Введите рост: ");
        height = input.nextInt();
        System.out.println("Введите вес: ");
        weight = input.nextInt();
        System.out.println("Введите цвет глаз: ");
        eyes_color = input.next();
        System.out.println("Введите среду обитания: ");
        inhabitancy = input.next();
        System.out.println("Введите дату нахожедения: ");
        date = input.next();
        System.out.println("Является ли волк вожаком: ");
        pack_leader = input.next();

        all_animals.add(new wolf(height, weight, eyes_color, inhabitancy, date, pack_leader));
    }

    public void tiger_add(Scanner input){
        int height; int weight; String eyes_color; String inhabitancy; String date;
        System.out.println("Введите рост: ");
        height = input.nextInt();
        System.out.println("Введите вес: ");
        weight = input.nextInt();
        System.out.println("Введите цвет глаз: ");
        eyes_color = input.next();
        System.out.println("Введите среду обитания: ");
        inhabitancy = input.next();
        System.out.println("Введите дату нахожедения: ");
        date = input.next();

        all_animals.add(new tiger(height, weight, eyes_color, inhabitancy, date));
    }

    public void hen_add(Scanner input){
        int height; int weight; String eyes_color; int flight_altitude;
        System.out.println("Введите рост: ");
        height = input.nextInt();
        System.out.println("Введите вес: ");
        weight = input.nextInt();
        System.out.println("Введите цвет глаз: ");
        eyes_color = input.next();
        System.out.println("Введите высоту полёта: ");
        flight_altitude = input.nextInt();

        all_animals.add(new hen(height, weight, eyes_color, flight_altitude));
    }

    public void stork_add(Scanner input){
        int height; int weight; String eyes_color; int flight_altitude;
        System.out.println("Введите рост: ");
        height = input.nextInt();
        System.out.println("Введите вес: ");
        weight = input.nextInt();
        System.out.println("Введите цвет глаз: ");
        eyes_color = input.next();
        System.out.println("Введите высоту полёта: ");
        flight_altitude = input.nextInt();

        all_animals.add(new stork(height, weight, eyes_color, flight_altitude));
    }

    public void show_animals(){
        int index = 0;
        for (animal animal : all_animals){
            System.out.printf("%d)", index);
            System.out.println(animal);
            System.out.println(" ");
            index++;
        }
    }

    public void remove_animal(int num){
        all_animals.remove(num);
    }

    public void animal_voice(int num){
        all_animals.get(num).voice();
    }

    public void animal_say(){
        for (animal animal : all_animals){
            animal.voice();
        }
    }
    
    public void get_animal(int num){
        System.out.println(all_animals.get(num));
        if (all_animals.get(num) instanceof pets){
            ((pets)all_animals.get(num)).petme();
        }
        if (all_animals.get(num) instanceof birds){
            ((flying)all_animals.get(num)).fly();
        }
    }
}