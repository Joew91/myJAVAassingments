
public class DieTest {
    public static void main(String[] args) {
        Die defaultDie = new Die();
        System.out.println("normal die (6 sides) roll value = " + defaultDie.getValue());
        Die tenSideddie = new Die(10);
        System.out.println("10 sided die: rolled value = " + tenSideddie.getValue());
        for (int i = 0; i < 5; i++) {
            tenSideddie.roll();
            System.out.println("roll number" + (i + 1) + "for 10 sided die: " + tenSideddie.getValue());

        }
    }
}
