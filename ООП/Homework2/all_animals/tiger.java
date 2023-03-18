package all_animals;

public class tiger extends wildAnimals {
    
    protected tiger(int height, int weight, String eyes_color, String inhabitancy, String date) {
        super(height, weight, eyes_color, inhabitancy, date);
    }

    public void voice() {
        System.out.println("РррРрР");
    }

    public String toString(){
        return String.format("%s\nТигр: %s", super.toString());
    }
}
