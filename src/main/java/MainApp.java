import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        Deck deck = new Deck();
        Hand hand1 = new Hand();
        String userInput;
        int playerCount = 0;

        Player playa1 = new Player("Yahir");

//        System.out.print("How many players?: ");
//        userInput = myScanner.nextLine();
//        playerCount = Integer.parseInt(userInput);
//
//        for (int i = 0; i < playerCount; i++) {
//
//        }

        // deal 5 cards
        for (int i = 0; i < 5; i++) {
            // get a card from the deck
            Card card = deck.deal();
            // deal that card to the hand
            hand1.addcard(card);
        }
        int handValue = hand1.getValue();
        System.out.println("This hand is worth " + handValue);
    }
}
