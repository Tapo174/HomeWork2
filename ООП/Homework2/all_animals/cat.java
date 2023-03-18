package all_animals;

public  class cat extends pets{

    private final String coat_color;

    protected cat(String name, String breed, String vaccination, String Bday, int height, int weight, String eyes_color, String coat_color){
        super(name, breed, vaccination, Bday, height, weight, coat_color);
        this.coat_color = coat_color;
    }

    public void petme() {
        System.out.println("\nПогладь кошечку =^_^=");
    }

    public void voice(){
        System.out.println("Мяу");
    }

    public String toString(){
        return String.format("%s\nЦвет шерсти: %s", super.toString(), this.coat_color);
    }
}
