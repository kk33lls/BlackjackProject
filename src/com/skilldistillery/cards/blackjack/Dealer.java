package com.skilldistillery.cards.blackjack;

import com.skilldistillery.cards.common.Card;
import com.skilldistillery.cards.common.Deck;

public class Dealer extends Player {
 //Hit, stand, deal cards
	//no getters for deck
	
	private Deck deck;
	//^ no more fields
	public Dealer() {
		super();
		deck = new Deck();
	}
	
	public Card dealCard() {
		return deck.dealCard();
	}
	
	public void hit(Card card) {
		
	}
	
	public void stand(Card card) {
		
	}
	
	public void showDealersHand() {
		System.out.println("DEALER " + hand.toString());
	}
	
	public void shuffleDeck() {
		deck.shuffle();
	}
	
}
