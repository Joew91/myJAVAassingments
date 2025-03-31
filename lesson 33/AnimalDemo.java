public class AnimalDemo {
    public static void main(String[] args) {
        Animal animal1 = new Animal("Lion", 5);
        Animal animal2 = new Animal("Tiger", 7);

        if (animal1.compareTo(animal2) > 0) {
            System.out.println(animal1 + "  older than " + animal2);
        } else if (animal1.compareTo(animal2) < 0) {
            System.out.println(animal2 + " older than " + animal1);
        } else {
            System.out.println(animal1 + " and " + animal2 + " are the same age.");
        }
    }
}
