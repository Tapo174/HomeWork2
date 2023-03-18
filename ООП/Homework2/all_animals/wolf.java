package all_animals;

public class wolf extends wildAnimals{
    
    private final String pack_leader;

    protected wolf(int height, int weight, String eyes_color, String inhabitancy, String date, String pack_leader) {
        super(height, weight, eyes_color, inhabitancy, date);
        this.pack_leader = pack_leader;
    }

    public void voice() {
        System.out.println("\nАуууу");
    }

    public String toString(){
        return String.format("Волк: %s \nВожак: %s", super.toString(), this.pack_leader);
    }
}
