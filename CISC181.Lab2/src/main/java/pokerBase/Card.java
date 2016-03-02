package pokerBase;

import java.util.Comparator;
import pokerEnums.eRank;
import pokerEnums.eSuit;

public class Card implements Comparable{

	private eRank eRank;
	private eSuit eSuit;
	private int iCardNbr;

	public Card(eSuit eSuit, eRank eRank, int iCardNbr) {
		super();
		this.eRank = eRank;
		this.eSuit = eSuit;
		this.iCardNbr = iCardNbr;
	}
	
	public int getiCardNbr() {
		return iCardNbr;
	}

	private void setiCardNbr(int iCardNbr) {
		this.iCardNbr = iCardNbr;
	}

	private void seteRank(eRank eRank) {
		this.eRank = eRank;
	}

	private void seteSuit(eSuit eSuit) {
		this.eSuit = eSuit;
	}

	public eRank geteRank(){
		return eRank;
	}
	
	public eSuit geteSuit(){
		return eSuit;
	}
	
	public static Comparator<Card> CardRank = new Comparator<Card>(){
		public int compare(Card c1, Card c2) {
			int Cno1 = c1.geteRank().getiRankNbr();
			int Cno2 = c2.geteRank().getiRankNbr();
			
			/*For descending order*/
			return Cno2 - Cno1;
		}
	};
	
	@Override
	public int compareTo(Object o){
		Card c = (Card) o;
		return c.getRank().compareTo(this.Rank);
	}
	
	@Override
	public String toString() {
		return String.valueOf(Rank) + " OF " + String.valueOf(Suit);
	}
	
}