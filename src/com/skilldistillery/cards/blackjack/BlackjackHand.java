package com.skilldistillery.cards.blackjack;

import com.skilldistillery.cards.common.Card;
import com.skilldistillery.cards.common.Hand;

public class BlackjackHand extends Hand{
	
	//NO fields
//	public void checkHandValue() {
//	
//		int total = getHandValue();
//		
//		if (isBlackjack()) {
//			System.out.print(total + " BLACKJACK!!");
//		} else if (isBust()) {
//			System.out.println(total + " BUST");
//		} else {
//			System.out.println("Current value of hand: " + total);
//		}
//	}

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
		System.out.println("Current value of hand: " + total);
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
