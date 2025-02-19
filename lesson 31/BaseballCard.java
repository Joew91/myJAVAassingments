public class BaseballCard {
    String name; // the name of the player on the card.
    int year; // the year the card was issued.

    public BaseballCard(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public String toString() {
        return "BaseballCard{Player=" + name + "', Year-" + year + "}";

    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        BaseballCard other = (BaseballCard) obj;
        return this.year == other.year && this.name.equals(other.name);

    }

    public static void main(String[] args) {
        BaseballCard card1 = new BaseballCard("Babe ruth", 1921);
        BaseballCard card2 = new BaseballCard("babe ruth", 1921);
        BaseballCard card3 = new BaseballCard("jackie Robinson", 1947);

        System.out.println("card 1:" + card1);
        System.out.println("card 2: " + card2);
        System.out.println("card 3: " + card3);

        System.out.println("card 1 equals card 2: " + card1.equals(card2));
        System.out.println("card 1 equals card 3" + card1.equals(card3));
    }
}