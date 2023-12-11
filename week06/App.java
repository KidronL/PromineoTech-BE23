package week06;

public class App {

	public static void main(String[] args) {
		
		//Declaring the variables such as the deck and the player.
		Deck deck = new Deck();
		Player chester = new Player("Chester Cheetah");
		Player ronald = new Player("Ronald McDonald");
		
		//randomizes the draw from the deck by shuffling the elements in the ArrayList
		deck.shuffle();
		
		//Loop to simulate the drawing of the deck. Since there are 52 elements stored in the ArrayList for deck, it will iterate until 51 as that will be the last index in the array.
		for (int i = 0; i < 52; i++) {
			chester.draw(deck);
			ronald.draw(deck);
		}
		
		//Display the hands of each player
		chester.describe();
		
		ronald.describe();
		
		//Loop to simulate the flipping of the cards to see who has the greater value card.
		for (int i = 0; i < 26; i++) {
			Card card1 = chester.flip();
			Card card2 = ronald.flip();
			
			//Displaying the cards that are flipped in each iteration of the loop.
			System.out.println("\n" + chester.getName() + " flipped " + card1.getName());
			System.out.println(ronald.getName() + " flipped " + card2.getName());
			
			//A conditional nested into the loop to compare the values of the cards flipped and determining who won the round.
			if (card1.getValue() > card2.getValue()) {
				chester.incrementScore();
				System.out.println("\nPoint goes to " + chester.getName() + "!");
			} else if (card1.getValue() < card2.getValue()) {
				ronald.incrementScore();
				System.out.println("\nPoint goes to " + ronald.getName() + "!");	
			} else {
				System.out.println("\nDraw! No Point!");
			}
		}
		
		//Functionality to display the scoreboard.
		System.out.println("\nScores");
		System.out.println(chester.getName() + " Score: " + chester.getScore());
		System.out.println(ronald.getName() + " Score: " + ronald.getScore());
		

		if (chester.getScore() > ronald.getScore()) {
			System.out.println("\n" + chester.getName() + " wins!");
		} else if (chester.getScore() < ronald.getScore()) {
			System.out.println("\n" + ronald.getName() + " wins!");	
		} else {
			System.out.println("\nTie Game! Ends in Draw");
		}
	}

}
