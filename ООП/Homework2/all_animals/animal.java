package all_animals;

public abstract class animal{

    private int height;
    private int weight;
    private String eyes_color;

    protected animal(int height, int weight, String eyes_color){
        this.height = height;
        this.weight = weight;
        this.eyes_color = eyes_color;
    }
    public abstract void voice();

    public String toString(){
        return String.format("%d \nРост: %d \nВес: %d \nЦвет глаз: %s", this.height, this.weight, this.eyes_color);
    }
}