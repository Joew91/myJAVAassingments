import java.util.Random;

public class Die {
    private int sides;
    private int currentvalue;
    private Random rand;

    public Die() {
        this(6);
    }

public Die(int sides) {
    if (sides < 1) throw new IllegalArgumentException("a die must have at leasst one side."); {
     this.sides = sides;
     this.rand = new Random();
     roll();   
    }

    public void roll() {
        this.currentvalue = rand.nextInt(sides) + 1;

    }

    public int getValue() {
        return currentvalue;
    }

    public int getsides() {
        return sides;
    }
}
