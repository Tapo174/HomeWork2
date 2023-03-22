import java.util.ArrayList;
import java.util.Scanner;

public class figiresCollection {
    
    static ArrayList<figures> all_figures = new ArrayList<>();
    {
        all_figures.add(new circle("Круг", 4.0));
        all_figures.add(new triangle("Треугольник", 3.0, 3.1, 6.5));
        all_figures.add(new square("Квадрат", 5.0));
        all_figures.add(new rectangle("Прямоугольник", 2.0, 3.0));
    }

    public static void get_parameters() {
        Double result = (double) 0;
        int index = 0;
        for (int i = 0; i < all_figures.size(); i++) {
            index++;
            result += ((figures)all_figures.get(i)).area();
        }
        System.out.printf("\nПлощадь всех " + index + " фигур = " + result + ";\n");
        index = 0;
        for (figures figure : all_figures) {
            if (figure instanceof perimeter) {
                index++;
                result += (((polygon)figure).get_perimeter());
            }
        }
        System.out.printf("Периметр всех возможных " + index + " фигур = " + result + ";\n");
        index = 0;
        for (figures figure : all_figures) {
            if (figure instanceof circle) {
                index++;
                result += (((circle)figure).ring());
            }
        }
        System.out.printf("Длина окружности всех " + index + " фигур = " + result + ";\n");
        index = 0;
    }
    
    public void all_perimeters(){
        Double result = (double) 0;
        for (figures figure : all_figures) {
            if (figure instanceof perimeter) {
                result += (((polygon)figure).get_perimeter());
            }
        }
    }

    public static void show_all() {
        int index = 0;
        for (figures figur : all_figures) {
            System.out.printf("%d ", index);
            System.out.println(figur);
            System.out.println("");
            index++;
        }
    }

    public static void delete_figure(Scanner input, ArrayList<figures> allFigure) {
        show_all();
        System.out.print("\nКакую фигуру удалить?: ");
        int choice = input.nextInt();
        if (choice < allFigure.size()) {
            allFigure.remove(choice);
            System.out.println("Вы успешно удалили животное!");
            program.Menu(input, allFigure);
        } else
            program.Menu(input, allFigure);
    }
}