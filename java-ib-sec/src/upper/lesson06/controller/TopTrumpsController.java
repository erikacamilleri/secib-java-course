package upper.lesson06.controller;

import upper.lesson06.model.CardDeck;
import upper.lesson06.view.TopTrumpsView;

public class TopTrumpsController {
    
    private TopTrumpsView view;

    private CardDeck cardDeck;

    public TopTrumpsController() {
        this.view = new TopTrumpsView();
        this.cardDeck = new CardDeck();
    }

    public void initialise() {
        
    }
}
