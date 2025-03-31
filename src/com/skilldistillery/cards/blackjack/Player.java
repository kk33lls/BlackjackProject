package com.skilldistillery.cards.blackjack;

import com.skilldistillery.cards.common.Card;

public class Player {
	//only field and no getters for the hand
	protected BlackjackHand hand;
	
	public Player() {
		hand = new BlackjackHand();
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
	public boolean isBlackjack() {
		return this.hand.isBlackjack();
	}
	public boolean isBust() {
		return this.hand.isBust();
	}
	
//	public boolean hit() {
//		// Player recieves another card
//		System.out.println("New card is being added..");
//		addCard(.);
//		showPlayerHand();
//		System.out.println("Current hand value is " + getHandValue());
//		
//		if(getHandValue() >= 21) {
//			if(getHandValue() > 21) {
//				isBust();
//				System.out.println("You lose! Thanks for playing...");
//				return false;
//			} else if(getHandValue() == 21) {
//				isBlackjack();
//				System.out.println("You win! Thanks for playing...");
//				return false;
//			}
//	}
//	
//  }
}
