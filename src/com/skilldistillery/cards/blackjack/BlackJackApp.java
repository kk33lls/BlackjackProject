package com.skilldistillery.cards.blackjack;

import java.util.Scanner;

public class BlackJackApp {
	//no more fields
	//no deck type variables
	//no hand variables
	private Scanner sc;
	private Dealer dealer;
	private Player player;
	
	public BlackJackApp() {
		this.sc = new Scanner(System.in);
		this.dealer = new Dealer();
		this.player = new Player();
	}

	public static void main(String[] args) {
		new BlackJackApp().launch();

	}
	
	public void launch() {
		dealFirstHand();
		hitOrStandOption();
		}

	
	public boolean dealFirstHand() {
		System.out.println("The dealer is laying out the first hand of cards...");
		
		// Dealer shuffles deck
		dealer.shuffleDeck();

		// Dealer deals a card to a player (both displayed)
		player.addCard(dealer.dealCard());
		player.addCard(dealer.dealCard());
		player.showPlayerHand(); 
		player.getHandValue();
		System.out.println("Your hand value is " + player.getHandValue());
	
		// Dealer deals a card to self (face up)
		dealer.addCard(dealer.dealCard());
		dealer.showDealersHand();
		System.out.println("Dealer's hand value is " + dealer.getHandValue());
		// Dealing second card (face down)
		dealer.addCard(dealer.dealCard());
		
	
		if(player.getHandValue() == 21 || dealer.getHandValue() == 21) {
			player.isBlackjack();
			System.out.println("You win!! Thanks for playing...");
			return false;	
		} else if(dealer.getHandValue() == 21) {
			dealer.isBlackjack();
			System.out.println("Dealer wins! Thanks for playing...");
			return false;
		}

		return true;

	}
	
	public void hitOrStandOption() {
		boolean isTrue = true;
		do {
			// Ask player if they would like to hit or stand
			System.out.println("Hit or stand?");
			String hitOrStand = sc.next();
			hitOrStand.equalsIgnoreCase(hitOrStand);
			System.out.println();
			
			if(hitOrStand.equals("hit")){
				// Player recieves another card
				System.out.println("New card is being added..");
				player.addCard(dealer.dealCard());
				player.showPlayerHand();
				System.out.println("Current hand value is " + player.getHandValue());
				
				if(player.getHandValue() >= 21) {
					if(player.getHandValue() > 21) {
						player.isBust();
						System.out.println("You lose! Thanks for playing...");
						isTrue = false;
					} else if(player.getHandValue() == 21) {
						player.isBlackjack();
						System.out.println("You win! Thanks for playing...");
						isTrue = false;
					}
				}
 
			} else if (hitOrStand.equals("stand")) {

				if(dealer.stand() == true) {
					if(dealer.getHandValue() >= player.getHandValue()) {
						System.out.println("Dealer wins! Thanks for playing...");
						isTrue = false;
					}
					else {
						System.out.println("Player wins! Thanks for playing...");
					}
				} isTrue = false;
			} else {
				System.err.println("Invalid input try again");
			}
			
		} while (isTrue);

	}
}

