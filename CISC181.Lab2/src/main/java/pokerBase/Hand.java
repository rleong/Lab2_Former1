package pokerBase;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Locale;

import pokerEnums.eHandStrength;

import static java.lang.System.out;
import static java.lang.System.err;

public class Hand {

	private ArrayList<Card> CardsInHand;
	private ArrayList<Card> BestCardsInHand;
	private HandScore HandScore;
	private boolean bScored = false;
	private boolean Flush;
	private boolean Straight;
	private boolean Ace;

	public Hand() {

	}

	/*public ArrayList<Card> getCardsInHand() {
		return CardsInHand;
	}

	public void setCardsInHand(ArrayList<Card> cardsInHand) {
		CardsInHand = cardsInHand;
	}

	public ArrayList<Card> getBestCardsInHand() {
		return BestCardsInHand;
	}

	public void setBestCardsInHand(ArrayList<Card> bestCardsInHand) {
		BestCardsInHand = bestCardsInHand;
	}

	public HandScore getHandScore() {
		return HandScore;
	}

	public void setHandScore(HandScore handScore) {
		HandScore = handScore;
	}

	public boolean isbScored() {
		return bScored;
	}

	public void setbScored(boolean bScored) {
		this.bScored = bScored;
	}

	public boolean isFlush() {
		return Flush;
	}

	public void setFlush(boolean flush) {
		Flush = flush;
	}

	public boolean isStraight() {
		return Straight;
	}

	public void setStraight(boolean straight) {
		Straight = straight;
	}

	public boolean isAce() {
		return Ace;
	}

	public void setAce(boolean ace) {
		Ace = ace;
	}

	public Hand AddCardToHand(Card c) {
		CardsInHand.add(c);
		return this;
	}*/

	/**
	 * EvaluateHand is a static method that will score
	 * 
	 * @param h
	 * @return
	 */

	/*
	 * public static Hand EvaluateHand(Hand h){ if (h.getCardsInHand().size() !=
	 * 5){
	 * 
	 * }
	 * 
	 * HandScore hs = new HandScore(); try{ Class<?> c =
	 * Class.forName("pokerBase.Hand") } }
	 */
	
}
