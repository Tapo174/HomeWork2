public class program {
    public class Program {
        public static void main(String[] args) {
            ArrayList<Integer> intList = new ArrayList<>();
            intList.add(5);
            intList.add(4);
            intList.add(3);
            intList.add(2);
            intList.add(1);
            intList.print_array();
            intList.index_remove(1);
            intList.print_array();
            intList.data_remove(3);
            intList.print_array();
            System.out.println(intList.min_data());
            System.out.println(intList.max_data()); 
            System.out.println(intList.sum_data());
            System.out.println(intList.mult_data());
            System.out.println(intList.find_index(2));
            System.out.println(intList.find_data(4));
            try {
                intList.bubble_sort();
                System.out.print("Результат: ");
                intList.print_array();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
    
            ArrayList<String> stringList = new ArrayList<>();
            stringList.add("Кот");
            stringList.add("Собака");
            stringList.add("Мышъ");
            stringList.add("Окунь");
            stringList.print_array();
            stringList.index_remove(1);
            stringList.print_array();
        }
    }
}
