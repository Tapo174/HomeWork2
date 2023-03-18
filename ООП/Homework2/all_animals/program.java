package all_animals;

import java.lang.ref.Cleaner;
import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        Zoo animals = new Zoo();
        Scanner input = new Scanner(System.in);
        Menu(animals, input);
        input.close();
    }

    private static void Menu(Zoo animals, Scanner input) {
        System.out.print("\nВыберите пункт меню: \n");
        System.out.println("1. Добавить животное в зоопарк");
        System.out.println("2. Удалить животное из зоопарка");
        System.out.println("3. Просмотреть информацию о животном");
        System.out.println("4. Прослушать звук выбранного животного");
        System.out.println("5. Просмотреть информацию о всех животных в зоопарке");
        System.out.println("6. Прослушать звук всех животных");
        System.out.println("7. Выйти");

        int choice = input.nextInt();
        switch (choice) {
            case 1:
                add_animal(animals, input);
                Menu(animals, input);
            case 2:
                remove_animal(animals, input);
                Menu(animals, input);
            case 3:
                animal_info(animals, input);
                Menu(animals, input);
            case 4:
                animals_voice(animals, input);
                Menu(animals, input);
            case 5:
                animals.show_animals();
                Menu(animals, input);
            case 6:
                animals.animal_say();
                Menu(animals, input);
            case 7:
                System.out.println("Возвращайтесь!");
                break;
        }
    }

    private static void animals_voice(Zoo animals, Scanner input) {
        animals.show_animals();
        System.out.printf("%d\n В меню", Zoo.all_animals.size());
        System.out.println("Введите номер животного, которого хотите послушать: ");
        int choice = input.nextInt();
        if (choice < Zoo.all_animals.size()) {
            animals.animal_voice(choice);
            animals_voice(animals, input);
        } else Menu(animals, input);
    }

    private static void animal_info(Zoo animals, Scanner input) {
        animals.show_animals();
        System.out.printf("%d) В меню", Zoo.all_animals.size());
        System.out.println("\nВведите номер животного, о котором хотите узнать: ");
        int choice = input.nextInt();
        if (choice < Zoo.all_animals.size()){
            animals.get_animal(choice);
            Menu(animals, input);
        }
    }

    private static void remove_animal(Zoo animals, Scanner input) {
        animals.show_animals();
        System.out.printf("%d)\n", Zoo.all_animals.size());
        System.out.println("Введите номер животного, о котором хотите узнать: ");
        int choice = input.nextInt();
        if (choice < Zoo.all_animals.size()){
            animals.remove_animal(choice);
            System.out.println("\nУдалён");
        } else Menu(animals, input);
    }

    private static void add_animal(Zoo animals, Scanner input) {
        System.out.println("\nВыберите пункт меню: ");
        System.out.println("1. Добавить кота");
        System.out.println("2. Добавить тигра");
        System.out.println("3. Добавить собаку");
        System.out.println("4. Добавить волка");
        System.out.println("5. Добавить курицу");
        System.out.println("6. Добавить аиста");
        System.out.println("7. Назад");

        int choice = input.nextInt();

        switch (choice) {
            case 1:
                animals.cat_add(input);
                Menu(animals, input);
            case 2:
                animals.tiger_add(input);
                Menu(animals, input);
            case 3:
                animals.dog_add(input);
                Menu(animals, input);
            case 4:
                animals.wolf_add(input);
                Menu(animals, input);
            case 5:
                animals.hen_add(input);
                Menu(animals, input);
            case 6:
                animals.stork_add(input);
                Menu(animals, input);
            case 7:
                Menu(animals, input);
        }
    }
}