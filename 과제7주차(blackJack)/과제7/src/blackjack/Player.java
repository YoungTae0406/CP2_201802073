package blackjack;

import java.util.ArrayList;

public class Player {
	
	ArrayList<Card> hand = new ArrayList<>();
	CardDeck CD = new CardDeck();
	static int i = -1;
	
	
	
	public void handing(){
		hand.add(CD.popCard());
	}
	public Card getCard() {
		i++;
		return hand.get(i);
	}
		
	public String statusCard() {
		StringBuffer SB = new StringBuffer("");
		for(int i=0;i<hand.size();i++) {
			SB.append("["+hand.get(i).getSuit()+"_"+hand.get(i).getRank()+"] ");
		}
		return SB.toString();
		
	}
	public int score() {
		int point = 0;
		while(true) {
			for(int i=0;i<hand.size();i++) {
				point += hand.get(i).getScore();
			}
			break;
		}
		return point;
	}
	
}

	
	

