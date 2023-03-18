package all_animals;

public abstract class pets extends animal implements pet{

    private String name;
    private String breed;
    private String vaccination;
    private String Bday;

    protected pets(String name, String breed, String vaccination, String Bday, int height, int weight, String eyes_color){
        super(height, weight, eyes_color);
        this.name = name;
        this.breed = breed;
        this.vaccination = vaccination;
        this.Bday = Bday;
    }

    public String toString(){
        return String.format("\nИмя: %s\nПорода: %s\nНаличие прививок: %s \nДата рождения: %s", this.name, this.breed, this.vaccination, this.Bday, super.toString());
    }

    public abstract void voice();

    public abstract void petme();

}
