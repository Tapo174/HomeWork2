package all_animals;
public abstract class wildAnimals extends animal{
    
    private String inhabitancy;
    private String date;

    protected wildAnimals(int height, int weight, String eyes_color, String inhabitancy, String date){
        super(height, weight, eyes_color);
        this.inhabitancy = inhabitancy;
        this. date = date;
    }
    
    public abstract void voice();

    public String toString(){
        return String.format("%s \nМесто обитания: %s \nДата нахождения: %s", super.toString(), this.inhabitancy, this.date);
    }
}
