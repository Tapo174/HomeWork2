public class exception extends Exception {
    public exception(String type){
        super(String.format("Type %s is not comparable", type));
    }
}
