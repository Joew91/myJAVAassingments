
public class Executive extends Manager {
    public static void main(String[] args) {
    }

    private double shares;

    public Executive(String name, double salary, double bonus, double shares) {
        super(name, salary, bonus);
        this.shares = shares;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("shares: %,.2%n " + shares);

    }
}
