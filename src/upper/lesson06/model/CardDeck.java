package upper.lesson06.model;

import java.util.ArrayList;

public class CardDeck {
    
    private ArrayList<Card> cardsP1;

    private ArrayList<Card> cardsP2;

    public CardDeck() {
    
    }

    private void load() {
        // to load all cards from database
        // shuffle
    }

    /**
     * https://www.rosettacode.org/wiki/Knuth_shuffle (recursive)
     * @param cards
     * @return
     */
    private ArrayList<Card> shuffle(ArrayList<Card> cards) {
        return cards;
    }
}
