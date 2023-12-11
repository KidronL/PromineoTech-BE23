package week06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	
	//Creating list where the cards will be stored
	private List<Card> cards;
	
	//creating the method to create the deck
	public Deck() {
		cards = new ArrayList<>();
		generateDeck();
	}
	
	//used to generate the deck based on 4 suites and values up to 14 for each card in each suit.
	private void generateDeck() {
		String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
		for (String suit : suits) {
			for (int i = 2; i <= 14; i++) {
				String name = getCardName(i, suit);
				Card card = new Card(i, name);
				cards.add(card);
			}
		}
	}
	
	//Functionality to shuffle the deck
	public void shuffle() {
		Collections.shuffle(cards);
	}
	
	//Drawing the cards, done out of sight. Populates the player's hands.
	public Card draw() {
		if(!cards.isEmpty()) {
			return cards.remove(0);
		} else {
			return null;
		}
	}
	
	//Getter for the card name. Allows us to pass in values for the face cards based on the numeric value of the card.
	private String getCardName(int x, String y) {
		String[] faceCards = {"Jack", "Queen", "King", "Ace"};
		if (x >= 11 && x <= 14) {
			return faceCards[x - 11] + " of " + y;
		} else {
			return x + " of " + y;
		}
	}

}
