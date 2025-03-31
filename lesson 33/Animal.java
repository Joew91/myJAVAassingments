public class Animal implements Comparable<Animal> {
    private String name;
    private int age;

    public static void main(String[] args) {

    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int compareTo(Animal other) {
        return Integer.compare(this.age, other.age);
    }

    public String toString() {
        return name + " (" + age + " years)";
    }
}
