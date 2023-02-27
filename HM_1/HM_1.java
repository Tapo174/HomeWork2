package Java.HM_1;
import java.util.Scanner;
public class HM_1 {
    public static void main(String[] args) {
        System.out.print("Введите последовательность треугольных чисел: ");
        Scanner in = new Scanner(System.in);
        int user_input = in.nextInt();
        int res = (user_input*(user_input+1))/2;
        System.out.println(res);
        in.close();
    }
}