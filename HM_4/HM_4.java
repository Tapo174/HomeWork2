package HM_4;
import java.util.Random;

public class HM_4 {
    
    public static void main (String[] args) {
        Random rand = new Random();
        int[] numbers = new int[8];
        
        for (int i = 0; i < numbers.length; i++)
            numbers[i] = rand.nextInt(1000);
        System.out.println("До сортировки: ");
        print_array(numbers);
        sorting(numbers);
        System.out.println("После сортировки: ");
        print_array(numbers);
    }

    public static void sorting(int[] numbers) {
        int len = numbers.length;
        for (int i = len / 2 - 1; i >= 0; i--)
            heapyfy(numbers, len, i);
        for (int i = len - 1; i >=0; i--){
            int temp = numbers[0];
            numbers[0] = numbers[i];
            numbers[i] = temp;
            heapyfy(numbers, i, 0);
        }
    }

    public static void heapyfy(int numbers[], int len, int i) {
        int big = i;
        int left = 2*i+1;
        int right = 2*i+2;
        if (left < len && numbers[left] > numbers[big]) {
            big = left;
        }
        if (right < len && numbers[right] > numbers[big]) {
            big = right;
        }
        if (big != i){
            int swap = numbers[i];
            numbers[i] = numbers[big];
            numbers[big] = swap;
            heapyfy(numbers, len, big);
        }
    }   

    public static void print_array(int[] numbers) {
        for (int i = 0; i < numbers.length; i++)
            System.out.print(numbers[i]+ " ");
        System.out.println();
    }
}
