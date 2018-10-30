package blackjack;

import java.util.ArrayList;

public class Dealer extends Player{
	
	ArrayList<Card> hand2 = new ArrayList<>();	
	static int k = -1;
	
	public void handing() {
		hand2.add(CD.popCard());
	}
	public Card getCard() {
		k++;
		return hand2.get(i);
	}
	public String statusCard() {
		StringBuffer SB = new StringBuffer("");
		for(int i=0;i<hand2.size();i++) {
			SB.append("["+hand2.get(i).getSuit()+"_"+hand2.get(i).getRank()+"] ");
		}
		return SB.toString();
	}
	public int score() {
		int point = 0;
		while(true) {
			for(int i=0;i<hand2.size();i++) {
				point += hand2.get(i).getScore();
			}
			break;
		}
		return point;
	}
}
