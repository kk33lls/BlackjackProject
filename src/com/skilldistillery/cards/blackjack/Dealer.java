package com.skilldistillery.cards.blackjack;

import com.skilldistillery.cards.common.Card;
import com.skilldistillery.cards.common.Deck;

public class Dealer extends Player {

	
	private Deck deck;
	
	public Dealer() {
		super();
		deck = new Deck();
	}
	
	public Card dealCard() {
		return deck.dealCard();
	}
	
	public void hit(Card card) {
		
	}
	
	public void Stand(Card card) {
		
	}
	
	public void showDealersHand() {
		System.out.println("DEALER " + hand.toString());
	}
	
	public void shuffleDeck() {
		deck.shuffle();
	}
	
	public String printWinner(int playerTotal, int dealerTotal) {
		return this.hand.printWinner(playerTotal, dealerTotal);
	}
	
}
