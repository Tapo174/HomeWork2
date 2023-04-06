package Зоопарк.all_animals.wilds;

public class wolf extends wild{
    protected boolean leader;

    public wolf(double height, double weight, String eyeColor, String date, String place, boolean leader) {
        super(height, weight, eyeColor, date, place);
        this.leader = leader;
    }
    protected wolf(double height, double weight, String eyeColor, String date, String place) {
        super(height, weight, eyeColor, date, place);
        this.leader = false;
    }
    public boolean isLeader() {
        return this.leader;
    }
    public String sound() {
        return "Ауууу!";        
    }
    public String toString() {
        return String.format("Wolf (%s)", super.toString());
    }
}
