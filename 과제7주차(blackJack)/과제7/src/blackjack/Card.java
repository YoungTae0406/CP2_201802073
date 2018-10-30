package blackjack;

import java.util.ArrayList;

public class Card {
	private String suit ;
	private String rank ;
	private int score;
	
	public void setSuit(String suit) {
		this.suit = suit;
	}
	public String getSuit() {
		return this.suit;
	}
	public void setRank(String rank) {
		this.rank = rank;
	}
	public String getRank() {
		return this.rank;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public int getScore() {
		return this.score;
	}	
}
