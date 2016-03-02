package base;

import pokerBase.Card;
import pokerBase.Deck;

public class Main {
	
	public static void main(String [] args){
		
		Deck haha = new Deck();
		
		for (int i = 0; i < haha.cards.size(); i++){
			Card value = haha.cards.get(i);
			System.out.println(value);
			//System.out.println(i);
		}
		//System.out.println(haha);
	}

}
