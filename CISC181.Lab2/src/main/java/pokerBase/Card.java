package pokerBase;

import pokerEnums.eRank;
import pokerEnums.eSuit;

public class Card {

	private eRank cRank;
	private eSuit cSuit;

	public Card(eSuit cSuite, eRank cRank) {
		this.cRank = cRank;
		this.cSuit = cSuit;
	}

}