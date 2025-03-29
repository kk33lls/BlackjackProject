package com.skilldistillery.cards.blackjack;

import com.skilldistillery.cards.common.Card;
import com.skilldistillery.cards.common.Hand;

public class BlackjackHand extends Hand{
	
	// NO fields
	public String printWinner(int playerTotal, int dealerTotal) {
		if (playerTotal > 21) {
			return "Player busts, Dealer wins";
		} else if (dealerTotal > 21) {
			return "Dealer busts, Player wins";
		} else if (playerTotal == dealerTotal) {
			return "Push";
		} else if (playerTotal > dealerTotal) {
			return "Player wins";
		} else {
			return "Dealer wins";
		}
	}

	@Override
	public int getHandValue() {
		int total = 0;
		int numAces = 0;
		
		for (Card card : cardsInHand) {
			
			if(card.getValue() == 11) {
				total += 11;
				numAces++;
			} else{
				total += card.getValue();
			}
		while(total > 21 && numAces > 0) {
			total -= 10;
			numAces--;
			}
		}
		return total;
		
	}
	
	//Stretch goal
	public boolean isBlackjack() {
		int total = getHandValue();
		if(total == 21) {
			System.out.println(total + " BLACKJACK!!");
			return true;
		}
		return false;
		
	}
	
	public boolean isBust() {
		int total = getHandValue();
		if(total > 21) {
			System.out.println(total + " BUST");
		return true;
		}
		return false;
	}

}
