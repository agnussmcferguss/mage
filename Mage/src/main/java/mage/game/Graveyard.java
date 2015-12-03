package mage.game;

import java.util.UUID;

import mage.cards.Card;
import mage.cards.CardsImpl;
import mage.constants.Zone;

public class Graveyard extends CardsImpl {
	
	public Graveyard() {
		super(Zone.GRAVEYARD);
	}
    
    public Graveyard(final Graveyard graveyard) {
        super(graveyard);
    }
    
    @Override
    public Graveyard copy() {
    	return new Graveyard(this);
    }
    
    public Card getTopCard(Game game) {
    	UUID card = null;
    	for (UUID cardId : this) {
    		card = cardId;
		}
    	return card != null ? game.getCard(card) : null;
    }

}