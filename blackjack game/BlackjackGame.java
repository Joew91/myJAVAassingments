import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

public class BlackjackGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        boolean playAgain = true;

        while (playAgain) {
            int playerScore = 0, dealerScore = 0;
            ArrayList<Integer> playerHand = new ArrayList<>();
            ArrayList<Integer> dealerHand = new ArrayList<>();

            playerHand.add(rand.nextInt(10) + 2);
            playerHand.add(rand.nextInt(10) + 2);
            dealerHand.add(rand.nextInt(10) + 2);
            dealerHand.add(rand.nextInt(10) + 2);

            playerScore = calculateScore(playerHand);
            dealerScore = calculateScore(dealerHand);

            System.out.println("your hand: " + playerHand);
            System.out.println("dealers face up card" + dealerHand.get(0));

            while (playerScore <= 21) {
                System.out.print("hit or stand? (hit/stand):");
                if (sc.nextLine().equalsIgnoreCase("hit")) {
                    playerHand.add(rand.nextInt(10) + 2);
                    playerScore = calculateScore(playerHand);
                    System.out.println("your hand:: " + playerHand);
                } else
                    break;
            }
            if (playerScore > 21) {
                System.err.println("you busted dealer wins");
            } else {
                System.out.println("dealers turn...");
                System.out.println("dealers full hand" + dealerHand);
                while (dealerScore < 17) {
                    dealerHand.add(rand.nextInt(10) + 2);
                    dealerScore = calculateScore(dealerHand);
                    System.out.println("Dealer's final hand: " + dealerHand);
                    System.out.println("Dealer's score: " + dealerScore);

                }
                if (dealerScore > 21 || playerScore > dealerScore) {
                    System.out.println("you win");
                } else if (dealerScore > playerScore) {
                    System.out.println("Dealer wins");

                } else {
                    System.out.println("its a draw.");
                }
            }
            System.out.print("play again? (yes or no: )");
            playAgain = sc.nextLine().equalsIgnoreCase("yes");

        }
        System.out.println("thanks for playing");
        sc.close();
    }

    public static int calculateScore(ArrayList<Integer> hand) {
        int score = 0, aces = 0;
        for (int card : hand) {
            if (card == 11)
                aces++;
            score += card;
        }
        while (score > 21 && aces-- > 0)
            score -= 10;
        {
            return score;
        }
    }
}
