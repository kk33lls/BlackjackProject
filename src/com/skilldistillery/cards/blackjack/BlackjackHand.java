package com.skilldistillery.cards.blackjack;

import com.skilldistillery.cards.common.Card;
import com.skilldistillery.cards.common.Hand;

public class BlackjackHand extends Hand{
	
	//NO fields
	//Create main to test run the methods

	@Override
	public int getHandValue() {
		int total = 0;
		int numAces = 0;
		
		for (Card card : cardsInHand) {
			
			if(card.getValue() == 11) {
				total += 11;
				numAces++;
			} else {
				total += card.getValue();
			}
		}
		while(total > 21 && numAces > 0) {
			total -= 10;
			numAces--;
		}
		return total;
	}
	
	//Stretch goal
	public boolean isBlackjack() {
		int value = getHandValue();
		if(value == 21) {
			return true;
		}
		return false;
		
	}
	
	public boolean isBust() {
		int value = getHandValue();
		if(value > 21) {
		return true;
		}
		return false;
	}

}
