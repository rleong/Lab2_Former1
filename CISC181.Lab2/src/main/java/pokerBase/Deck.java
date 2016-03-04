package pokerBase;

import pokerEnums.eRank;
import pokerEnums.eSuit;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collections;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Deck {

	private ArrayList<Card> deckCards = new ArrayList<Card>();
	
	public Deck() {
		
		// Create an ArrayList of Cards, add each card
		ArrayList<Card> MakingDeck = new ArrayList<Card>();
		for (short i = 0; i <= 3; i++){
			eSuit SuitValue = eSuit.values()[i];
			
			for (short j = 0; j <= 12; j++){
				eRank RankValue = eRank.values()[j];
				Card NewCard = new Card(RankValue, SuitValue, (13*i)+j+1);
				MakingDeck.add(NewCard);
			} 
		}
		// Set the instance variable
		deckCards = MakingDeck;
		ShuffleCards();
		
	}
	
	//For testing and debugging purposes only!
	public void debuggingDeck(){
		for (int i = 0; i < deckCards.size(); i++){
			Card value = deckCards.get(i);
			System.out.println(value);
		}
	}
	
	public Card DrawCard(){
		return deckCards.remove(0);
	}
	
	/**
	 * Draws a card from the instance of Deck
	 * @return
	 * @throws DeckException
	 */
//	public Card Draw() throws DeckException
//	{
//		if (deckCards.size() == 0)
//		{
//			throw new DeckException(this);
//		}
//		return deckCards.remove(0);
//	}
	
	private void ShuffleCards(){
		// Shuffle the cards
		Collections.shuffle(deckCards);
	}
	
}
