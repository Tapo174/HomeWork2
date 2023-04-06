package Зоопарк.all_animals.birds;

public abstract class flying extends bird{
    protected int flyingHeight;

    protected flying(double height, double weight, String eyeColor, int flyingHeight) {
        super(height, weight, eyeColor);
        this.flyingHeight = flyingHeight;
    }

    public int getflyingHeight() {
        return this.flyingHeight;
    }
    protected flying(double height, double weight, String eyeColor) {
        super(height, weight, eyeColor);
        this.flyingHeight = 0;
    }
    public String fly() {
        return String.format("I'm flying at %d meters\n", this.getflyingHeight());
    }
    public String toString() {
        return String.format("%s, Flight height: %s", super.toString(), this.getflyingHeight());
    }
}   