public class ArrayList<T>{
    private static final int start_len = 1;
    private int lenght;
    private T[] data;

    public ArrayList(){
        this.lenght = 0;
        this.data = (T[]) new Object[start_len];
    }
    
    public ArrayList(T[] data){
        this.lenght = data.length;
        this.data = data;
    }

    public int get_lenght(){
        return this.lenght;
    }

    public T[] get_data(){
        return this.data;
    }

    public void print_array(){
        System.out.println("[");
        for (int i = 0; i < this.get_lenght(); i++){
            if (i != this.get_lenght() - 1)
                System.out.print(this.data[i] + ",");
            else
                System.out.print(this.data[i]);
        }
        System.out.print("]\n");
    }

    public void add(T element) {
        if (this.lenght == this.data.length) {
            add_lenght();
        }
        this.data[this.lenght++] = element;
    }

    public void add_lenght(){
        int addLen = this.get_lenght() + 1;
        T[] addData = (T[]) new Object[addLen];
        for (int i = 0; i < this.get_lenght(); i++){
            addData[i] = this.data[i];
        }
        this.data = addData;
    }

    public void index_remove(int index) throws IndexOutOfBoundsException{
        if (index < 0 || index > this.get_lenght()){
            System.out.printf("Index %d out of bounds for length %d\n", index, this.get_lenght());
        }
        else{
            int addLen = this.get_lenght() - 1;
            T[] addData = (T[]) new Object[addLen];
            int i = 0;
            while (i < index){
                addData[i] = this.data[i];
                i++;
            }
            i++;
            while (i < this.get_lenght()){
                addData[i - 1] = this.data[i];
                i++;
            }
            this.data = addData;
            this.lenght--;
        }
    }
    
    public void data_remove(T element){
        for (int i = 0; i < data.length; i++){
            if (data[i] == element){
                index_remove(i);
                i--;
            }
        }
    }

    public int min_data(){
        int min = (int) this.data[0];
        for (int i = 0; i < data.length; i++){
            if (min > (int) this.data[i]){
                min = (int) this.data[i];
            }
        }
        return min;
    }

    public int max_data() {
        int max = (int) this.data[0];
        for (int i = 0; i < data.length; i++) {
            if (max < (int) this.data[i]) {
                max = (int) this.data[i];
            }
        }
        return max;
    }

    public int sum_data(){
        int result = 0;
        for (int i = 0; i < data.length; i++) {
            result += (int) this.data[i]; 
        }
        return result;
    }

    public int mult_data(){
        int result = 1;
        for (int i = 0; i < data.length; i++) {
            result *= (int) this.data[i]; 
        }
        return result;
    }

    public int find_index(T element){
        int count = 0;
        for (T t : data) {
            if (t == element){
                return count;
            }
            count++;
        }
        return -1;
    }
    public boolean find_data(T element){
        for (T t : data) {
            if (t == element){
                return true;
            }
        }
        return false;
    }

    public void bubble_sort() throws exception {
        T temp = this.data[0];
        if (temp instanceof Comparable) {
            for (int i = 0; i < this.get_lenght() - 1; i++) {
                boolean has_swap = false;
                for (int j = 0; j < this.get_lenght() - i - 1; j++) {
                    Comparable<T> elem = (Comparable<T>)this.data[j];
                    T nextElem = this.data[j + 1];
                    if (elem.compareTo(nextElem) > 0) {
                        swap(j, j + 1);
                        has_swap = true;
                    }
                }
                if (!has_swap) {
                    break;
                }
            }
        }
        else {
            throw new exception(temp.getClass().getSimpleName());
        }
    }

    private void swap(int i, int j) {
        T temp = this.data[i];
        this.data[i] = this.data[j];
        this.data[j] = temp;
    }

    public void insert_sort() throws exception {
        T tmp = this.data[0];
        if (tmp instanceof Comparable) {
            for (int i = 1; i < this.get_lenght(); i++) {
                for (int j = i; j > 0; j--) {
                    Comparable<T> elem = (Comparable)this.data[j];
                    T prevElem = this.data[j - 1];
                    if (elem.compareTo(prevElem) < 0) {
                        swap(j, j - 1);
                    } else {
                        break;
                    }
                }
            }
        } else {
            throw new exception(tmp.getClass().getSimpleName());
        }
    }

    public void select_sort() throws exception {
        T min = this.data[0];
        if (min instanceof Comparable) {
            for (int i = 0; i < this.get_lenght(); i++) {
                min = this.data[i];
                int min_idx = i;

                for (int j = i; j < this.get_lenght(); j++) {
                    Comparable<T> elem = (Comparable<T>)this.data[j];
                    if (elem.compareTo(min) < 0) {
                        min = this.data[j];
                        min_idx = j;
                    }
                }

                if (i != min_idx) {
                    swap(i, min_idx);
                }                
            }
        } else {
            throw new exception(min.getClass().getSimpleName());
        }
    }
}