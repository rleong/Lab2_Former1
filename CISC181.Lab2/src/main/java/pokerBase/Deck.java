package pokerBase;

import pokerEnums.eRank;
import pokerEnums.eSuit;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collections;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Deck {

	public ArrayList<Card> cards;
	
	public Deck() {
		
		// Create an ArrayList of Cards, add each card
		ArrayList<Card> MakingDeck = new ArrayList<Card>();
		for (short i = 0; i <= 3; i++){
			eSuit SuitValue = eSuit.values()[i];
			
			for (short j = 0; j <= 12; j++){
				eRank RankValue = eRank.values()[j];
				Card NewCard = new Card(SuitValue, RankValue);
				MakingDeck.add(NewCard);
			} 
		}
		// Set the instance variable
		cards = MakingDeck;
		ShuffleCards();
		
	}
	
	/*public Deck(int iJokers){
		this();
	}*/
	
	private void ShuffleCards(){
		// Shuffle the cards
		Collections.shuffle(cards);
	}
	
}
