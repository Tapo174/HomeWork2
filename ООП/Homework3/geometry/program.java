import java.util.Scanner;
import java.util.ArrayList;
public class program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Menu(input, get_array_B());
        input.close();
    }

    public static ArrayList<figures> get_array_B() {
        return figiresCollection.all_figures;
    }

    public static void Menu(Scanner input, ArrayList<figures> all_figures) {
        System.out.println("\n1. Добавить новую фигуру");
        System.out.println("2. Посчитать периметр у всех фигур");
        System.out.println("3. Посчитать площадь у всех фигур");
        System.out.println("4. Вывода информации о всех периметах, площадях и длиннах окружности всех фигур");
        System.out.println("5. Удаление фигуры");
        System.out.println("6. Изменение фигуры");
        System.out.println("7. Вывод информации о всех фигурах");
        System.out.print("Введите число: ");
        int choise = input.nextInt();
        System.out.println();
        switch (choise) {
            case 1:
                choise(input, all_figures);
                Menu(input, all_figures);
            case 2:
                all_perimeters(all_figures);
                Menu(input, all_figures);
            case 3:
                get_areas(all_figures);
                Menu(input, all_figures);
            case 4:
                figiresCollection.get_parameters();
                Menu(input, all_figures);
            case 5:
                figiresCollection.delete_figure(input, all_figures);
                Menu(input, all_figures);
            case 6:
                edit_figure(input, all_figures);
                Menu(input, all_figures);
            case 7:
                figiresCollection.show_all();
                Menu(input, all_figures);
        }
    }

    private static void choise(Scanner input, ArrayList<figures> all_figures) {
        System.out.print("Ваш выбор: ");
        System.out.println("1. Создать Треугольник");
        System.out.println("2. Создать Квадрат");
        System.out.println("3. Создать Прямоугольник");
        System.out.println("4. Создать Круг");
        System.out.println("5. Назад");
        int choise = input.nextInt();
        switch (choise) {
            case 1:
                create_triangle(input, all_figures);
                choise(input, all_figures);
            case 2:
                create_square(input, all_figures);
                choise(input, all_figures);
            case 3:
                create_rectangle(input, all_figures);
                choise(input, all_figures);
            case 4:
                create_circle(input, all_figures);
                choise(input, all_figures);
            case 5:
                Menu(input, all_figures);
        }
    }

    private static void create_square(Scanner input, ArrayList<figures> all_figures) {
        System.out.println("\nВведите название фигуры: ");
        String name = input.nextLine();
        System.out.print("Введите сторону a: ");
        Double a = input.nextDouble();
        all_figures.add(new square(name, a));
    }

    private static void create_rectangle(Scanner input, ArrayList<figures> all_figures) {
        System.out.println("\nВведите название фигуры: ");
        String name = input.nextLine();
        System.out.print("Введите сторону a: ");
        Double a = input.nextDouble();
        System.out.print("Введите сторону b: ");
        Double b = input.nextDouble();
        all_figures.add(new rectangle(name, a, b));
    }

    private static void create_circle(Scanner input, ArrayList<figures> all_figures) {
        System.out.println("\nВведите название фигуры: ");
        String name = input.nextLine();
        System.out.print("Введите радиус: ");
        Double radius = input.nextDouble();
        all_figures.add(new circle(name, radius));
    }

    private static void create_triangle(Scanner input, ArrayList<figures> all_figures) {
        System.out.println("\nВведите название фигуры: ");
        String name = input.nextLine();
        System.out.print("Введите сторону a: ");
        Double a = input.nextDouble();
        System.out.print("Введите сторону b: ");
        Double b = input.nextDouble();
        System.out.print("Введите сторону b: ");
        Double c = input.nextDouble();
        all_figures.add(new triangle(name, a, b, c));
    }

    private static void get_areas(ArrayList<figures> all_figures) {
        Double result = (double) 0;
        for (int i = 0; i < all_figures.size(); i++) {
            result += ((figures) all_figures.get(i)).area();
        }
        System.out.printf("\nПлощадь всех фигур = " + result + ";\n");
    }

    private static void all_perimeters(ArrayList<figures> all_figures) {
        Double result = (double) 0;
        for (figures figure : all_figures) {
            if (figure instanceof perimeter) {
                result += (((polygon) figure).get_perimeter());
            }
        }
        System.out.printf("\nПериметр всех возможных фигур = " + result + ";\n");
    }

    public static void edit_figure(Scanner input, ArrayList<figures> all_figures){
        System.out.println("Chose number of figure for changing");
        System.out.println("1. Изменить квадрат");
        System.out.println("2. Изменить прямоугольник");
        System.out.println("3. Изменить треугольник");
        System.out.println("4. Изменить круг");
        System.out.println("5. Назад");
        int choise = input.nextInt();
        switch(choise){
            case 1:
            create_square(input, all_figures);
            choise(input, all_figures);
            case 2: 
            create_rectangle(input, all_figures);
            choise(input, all_figures);
            case 3: 
            create_triangle(input, all_figures);
            choise(input, all_figures);
            case 4: 
            create_circle(input, all_figures);
            choise(input, all_figures);
            case 5:
            Menu(input, all_figures);
        }
    }
}