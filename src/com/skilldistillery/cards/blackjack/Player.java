package com.skilldistillery.cards.blackjack;

import com.skilldistillery.cards.common.Card;

public class Player {
	//only field and no getters for the hand
	protected BlackjackHand hand;
	
	public Player() {
		hand = new BlackjackHand();
	}
	
	public void hit(Card card) {
		this.hand.addCard(card);
	}
	
	public int getHandValue() {
		return this.hand.getHandValue();
	}
	
	public void addCard(Card card) {
		hand.addCard(card);
	}
	
	public void showPlayerHand() {
		System.out.println("PLAYER " + hand.toString());
	}
}
