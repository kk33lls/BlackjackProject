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
	
	public void dealFirstHand() {
		System.out.println("The dealer is laying out the first hand of cards...");
		
		// Dealer shuffles deck
		dealer.shuffleDeck();

		// Dealer deals a card to a player (both displayed)
		player.addCard(dealer.dealCard());
		player.addCard(dealer.dealCard());
		player.showPlayerHand(); 
		player.getHandValue();
	
		// Dealer deals a card to self (face up)
		dealer.addCard(dealer.dealCard());
		dealer.showDealersHand();
		// Dealing second card (face down)
		dealer.addCard(dealer.dealCard());

	}
	
	public void hitOrStandOption() {
		boolean isTrue = true;
		do {
			// Ask player if they would like to hit or stand
			System.out.println("Would you like to hit or stand?");
			String hitOrStand = sc.next();
			hitOrStand.equalsIgnoreCase(hitOrStand);
			System.out.println();
			
			if(hitOrStand.equals("hit")){
				// Player recieves another card
				System.out.println("New card is being added..");
				player.addCard(dealer.dealCard());
				player.showPlayerHand();
				player.getHandValue();
  //TODO Need to create a method in player that takes the above emthod calls and returns a value so that we can exit the loop once we Bust or hit blackjack
			} else if(hitOrStand.equals("stand")) {
				//Dealer shows both cards
				System.out.println("Dealer faces their card up...");
				dealer.showDealersHand();
				dealer.getHandValue();
	//TODO Determine winner, create a method maybe inside the app?
			} else {
				System.err.println("Invalid input try again");
			}
		} while (isTrue);

	}

		 
	}

