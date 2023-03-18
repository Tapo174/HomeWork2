package all_animals;

public class tiger extends wildAnimals {
    
    protected tiger(int height, int weight, String eyes_color, String inhabitancy, String date) {
        super(height, weight, eyes_color, inhabitancy, date);
    }

    public void voice() {
        System.out.println("\nРррРрР");
    }

    public String toString(){
        return String.format("Тигр: %s", super.toString());
    }
}
