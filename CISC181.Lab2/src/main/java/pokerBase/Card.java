package pokerBase;

import pokerEnums.eRank;
import pokerEnums.eSuit;

public class Card {

	private eRank Rank;
	private eSuit Suit;

	public Card(eSuit Suit, eRank Rank) {
		this.Rank = Rank;
		this.Suit = Suit;
	}

}