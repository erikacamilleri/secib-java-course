package upper.lesson06.model;

import java.util.ArrayList;
import java.util.HashMap;

public class Card {

    private HashMap<String, Integer> properties;

    public Card() {
        
    }

    public int getValueOf(String property) {
        return properties.get(property);
    }

    public boolean isWinner(Card card, String property) {
        return this.getValueOf(property) > this.getValueOf(property);
    }

    /**
     * Queries
     */
    public static ArrayList<Card> all() {
        return null;
    }
}
