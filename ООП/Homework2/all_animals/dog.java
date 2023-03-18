package all_animals;

public class dog extends pets{

    private final String train; 

    protected dog(String name, String breed, String vaccination, String color, String Bday, int height, int weight, String eyes_color, String train) {
        super(name, breed, vaccination, Bday, height, weight, eyes_color);
        this.train = train;
    }

    public void training(){
        System.out.println("\nУчится команде 'сидеть' ");
    }

    public void petme() {
        System.out.println("\nПоиграй с собачкой ^_^");
    }

    public void voice() {
        System.out.println("\nГав");
    }

    public String toString(){
        return String.format("Собака  %s\nДрессировка:%s", super.toString(), this.train);
    }
}
