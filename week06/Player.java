package week06;

import java.util.ArrayList;
import java.util.List;

public class Player {
	
	//Declaring the variable including the list which includes the cards in player's hands.
	private List<Card> hand;
	private int score;
	private String name;
	
	//Creating the player class. This stores the hand, score, and name
	public Player(String name) {
		hand = new ArrayList<>();
		score = 0;
		this.name = name;
	}
	
	//This will state the hand of the player.
	public void describe() {
		System.out.println(name + "'s hand:");
		for (Card card : hand) {
			card.describe();
			}
		}
		
		//Method to flip the cards for comparison
		public Card flip() {
			if (!hand.isEmpty()) {
				return hand.remove(0);
			} else {
				System.out.println("Hand is empty.");
				return null;
			}
		}
		
		//Method to draw from the deck and add cards to the player's hands
		public void draw(Deck deck) {
			Card card = deck.draw();
			if (card != null) {
				hand.add(card);
			}
		}
		
		//Method to increment the score by 1.
		public void incrementScore() {
			score++;
		}
		
		//Getter for the score
		public int getScore() {
			return score;
		}
		
		//Getter for the name
		public String getName() {
			return name;
		}
	
	}

	
