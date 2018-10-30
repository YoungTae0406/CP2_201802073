package blackjack;

import java.util.ArrayList;
import java.util.Collections;

public class CardDeck {
	String[] shape = {"Spade", "Club", "Heart", "Diamond"};
	int[] score = new int[13];
	static int j=-1;
	
	ArrayList<Card> deck = new ArrayList<>();
	
	public CardDeck() {
		
		for(String suit : shape) {
			for(int i=1;i<=13;i++) {
				Card cd = new Card();
				String rank2;
				
				if(i==1) {rank2 = "A"; score[i-1] = 1;}
				else if(i==11) {rank2 = "J"; score[i-1] = 10;}
				else if(i==12) {rank2 = "Q"; score[i-1] = 10;}
				else if(i==13) {rank2 = "K"; score[i-1] = 10;}
				else {rank2 = String.valueOf(i);
				score[i-1] = i;}
					
				cd.setRank(rank2);
				cd.setSuit(suit);
				cd.setScore(score[i-1]);
				deck.add(cd);
			}
		}
	}
	public Card popCard() {
		j++;
		return deck.remove(j);
		
	}
	public void shuffle() {
		Collections.shuffle(deck);
	}
	
}
