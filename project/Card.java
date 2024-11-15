import java.util.Random;

public class Card {

    public enum Suit {
        SPADE, HEART, CLUB, DIAMOD
    }

    public enum Rank {
        TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING, ACE
    }

    private Suit suit;
    private Rank rank;
    private static final char SPADE_SYMBOL = '\u2660';
    private static final char HEART_SYMBOL = '\u2661';
    private static final char CLUB_SYMBOL = '\u2663';
    private static final char DIAMOND_SYMBOL = '\u2662';

    public Card() {
        this.suit = Suit.values()[new Random().nextInt(Suit.values().length)];
        this.rank = Rank.values()[new Random().nextInt(Rank.values().length)];
    }

    public Card(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public Suit getSuit() {
        return suit;
    }

    public Rank getRank() {
        return rank;
    }

    public String getFace() {
        char suitSymbol;
        switch (suit) {
            case SPADE:
                suitSymbol = SPADE_SYMBOL;
                break;
            case HEART:
                suitSymbol = HEART_SYMBOL;
                break;
            case CLUB:
                suitSymbol = CLUB_SYMBOL;
                break;
            case DIAMOD:
                suitSymbol = DIAMOND_SYMBOL;
                break;
            default:
                suitSymbol = '?';

        }
        String rankSymbol;
        switch (rank) {
            case TWO:
                rankSymbol = "2";
                break;
            case THREE:
                rankSymbol = "3";
                break;
            case FOUR:
                rankSymbol = "4";
                break;
            case FIVE:
                rankSymbol = "5";
                break;
            case SIX:
                rankSymbol = "6";
                break;
            case SEVEN:
                rankSymbol = "7";
                break;
            case EIGHT:
                rankSymbol = "8";
                break;
            case NINE:
                rankSymbol = "9";
                break;
            case TEN:
                rankSymbol = "T";
                break;
            case JACK:
                rankSymbol = "J";
                break;
            case QUEEN:
                rankSymbol = "Q";
                break;
            case KING:
                rankSymbol = "K";
                break;
            case ACE:
                rankSymbol = "A";
                break;
            default:
                rankSymbol = "?";

        }
        return suitSymbol + rankSymbol;

    }

    public static void main(String[] args) {
        Card queenOfHearts = new Card(Suit.HEART, Rank.QUEEN);
        System.out.println("the card should be the queen of hearts");
        System.out.println(" " + queenOfHearts.getFace());

        System.out.println("10 random cards ");
        for (int i = 0; i < 10; i++) {
            Card randomCard = new Card();
            System.out.println("  " + randomCard.getFace());
            ;
        }
    }
}