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
	
	public void showDealersHand() {
		System.out.println("DEALER " + hand.toString());
	}
	
	public void shuffleDeck() {
		deck.shuffle();
	}
	
	public String printWinner(int playerTotal, int dealerTotal) {
		return this.hand.printWinner(playerTotal, dealerTotal);
	}
	
	public boolean stand() {
		// Dealer shows both cards
		System.out.println("Dealer faces their second card up...");
		showDealersHand();
		System.out.println("Dealers hand value is " + getHandValue());
		
		// Checks for rule of 17
		while (getHandValue() <= 16) {
			// If less than or equal to 16, dealer continues drawing cards
			System.out.println("The dealer gets a new card...");
			addCard(dealCard());
			showDealersHand();
			System.out.println("Dealer's hand value is " + getHandValue());

			// If dealer busts, user wins
			if (getHandValue() > 21) {
				isBust();
				System.out.println("Player wins!! Thanks for playing...");
				return false;
				
			} else if (getHandValue() == 21) {
				isBlackjack();
				System.out.println("Dealer wins! Thanks for playing...");
				return false;
				
			} 
		}
		return true;
	}
}

