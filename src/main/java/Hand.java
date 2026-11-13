import java.util.ArrayList;

public class Hand {
    private ArrayList<Card> cards;

    public Hand() {
        cards = new ArrayList<>();
    }

    // A Card is dealt to the Hand and the Hand is responsible
    // to store the card
    public void addCard(Card card) {
        this.cards.add(card);
    }

    public int getSize() {
        return cards.size();
    }

    // The Hand uses the methods of each card to determine
    // the value of each card - and adds up all values
    public int getValue() {
        int value = 0;
        for (Card card : cards) {
            value += card.getPointValue();
        }
        return value;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Card card : cards) {
            sb.append(card.getValue()).append(" of ").append(card.getSuit()).append(" ");
        }
        return sb.toString();
    }

}
