import java.util.ArrayList;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        Deck deck = new Deck();
        deck.shuffle();
        String winnerName = "no one";
        int winner = 0;

        ArrayList<Player> players = makePlayers(myScanner);

        for (Player player : players) {
            for (int i = 0; i < 2; i++) {
                Card card = deck.deal();
                player.hand.addCard(card);
            }
        }


        //display hands

        for (Player player : players) {
            System.out.println(player.name + ": " + player.hand.toString());
            System.out.println("Value: " + player.hand.getValue());
            if(player.hand.getValue() > winner) {
                winner = player.hand.getValue();
                winnerName = player.name;
            }
        }

        System.out.println("The winner is: " + winnerName + " with a value of " + winner);

    }
    public static ArrayList<Player> makePlayers(Scanner methodScanner) {
        System.out.print("how many players?: ");
        String userInput = methodScanner.nextLine();
        int playerNum = Integer.parseInt(userInput);
        ArrayList<Player> players = new ArrayList<>();

        for (int i = 0; i < playerNum; i++) {
            System.out.print("give player " + (i + 1) + " name: " );
            userInput = methodScanner.nextLine();
            players.add(new Player(userInput));
        }
        return players;
    }

}
