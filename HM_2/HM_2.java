//Реализовать функцию возведения числа а в степень b. a, b ∈ Z. Сводя количество выполняемых действий к минимуму. 
package HM_2;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class HM_2 {
    public static void main(String[] args) throws IOException {
        User_input();
    }
    public static void User_input() throws IOException{
        System.out.print("Введите число возводимое в степень: ");
        Scanner in = new Scanner(System.in);
        String a = in.next();
        System.out.print("Введите степень: ");
        String b = in.next();
        in.close();
        try (FileWriter writer = new FileWriter("input.txt", true)){
            writer.write("\na = " + a);
            writer.write("\nb = " + b);
            writer.close();
        } 
            catch (IOException e) {
            e.printStackTrace();}
        double x = Integer.parseInt(a.trim());
        double y = Double.parseDouble(b.trim());
        double res = x;
        if (x == 0) {
            try (FileWriter writer = new FileWriter("output.txt", true)){
                writer.write("\nНе определено");
            }
                catch (IOException e) {
                    e.printStackTrace();}
                System.out.println("Ответ записан в файле: output.txt");
            }
        if (y == 0){
            try (FileWriter writer = new FileWriter("output.txt", true)){
                writer.write("\nответ: 1");
            }
            catch (IOException e) {
                e.printStackTrace();}
                System.out.println("Ответ записан в файле: output.txt");
            }
        if (y < 0){
            y = y * -1;
            while (y != 1) {
                res = res * x;
                y = y - 1;
                }
                try (FileWriter writer = new FileWriter("output.txt", true)){
                    writer.write("\nответ: " + (1 / res));
                }
                catch (IOException e) {
                    e.printStackTrace();}
                System.out.println("Ответ записан в файле: output.txt");
        }
        if(y < 0){
            while (y != 1) {
                res = res * x;
                y = y - 1;
                }
                try (FileWriter writer = new FileWriter("output.txt", true)){
                    writer.write("\nответ: " + (res));
                }
                catch (IOException e) {
                    e.printStackTrace();}
                System.out.println("Ответ записан в файле: output.txt");
        }
       
    }
}