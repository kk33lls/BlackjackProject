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
		dealCards();
	}
	
	public void dealCards() {
		 boolean isTrue = true;
		
		 do{
			dealer.shuffleDeck();
			//Dealer deals a card to a player (Should be displayed)
			player.addCard(dealer.dealCard());
			player.showHand();//Intended to display
			//Dealer deals a card to self (not displayed)
			dealer.dealCard();
			//Checks hand value of player
			player.getHandValue();
			//checks hand value of dealer
			dealer.getHandValue();
			
			
		
		}while (isTrue);
	
		 
	}

}
