package Java.HM_3;
import java.util.Random;

public class HM_3 {
    public static void  main(String[] args) {
        Random rand = new Random();
        int[] numbers = new int[6];
        
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(100);
        }
        System.out.println("До сортировки: ");
        print_array(numbers);
        sorting_process(numbers);

        System.out.println("После сортировки: ");
        print_array(numbers);
    }

    public static void sorting_process(int[] input_array) {
        int input_length = input_array.length;
        if (input_length < 2){
            return;
        }
        int mid_index = input_length / 2;
        int[] left_half = new int[mid_index];
        int[] right_half = new int[input_length - mid_index];
        
        for (int i = 0; i < mid_index; i++){
            left_half[i] = input_array[i];
        }
        for (int i = mid_index; i < input_length; i++){
            right_half[i - mid_index] = input_array[i];
        }
        sorting_process(left_half);
        sorting_process(right_half);

        merge(input_array, left_half, right_half);
    }

    public static void merge(int[] input_array, int[] left_half, int[] right_half) {
        int left_size = left_half.length;
        int right_size = right_half.length;

        int i = 0, j = 0, k = 0;

        while (i < left_size && j < right_size){
            if (left_half[i] <= right_half[j]){
                input_array[k] = left_half[i];
                i++;
            }
            else{
                input_array[k] = right_half[j];
                j++;
            }
            k++;
            }
            while (i < left_size) {
                input_array[k] = left_half[i];
                i++;
                k++;
            }
            while (j < right_size) {
                input_array[k] = right_half[j];
                j++;
                k++;
            }
    }
    public static void print_array(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}