package week06;

public class Card {
	
	//Declaring the variables
	int value;
	String name;
	
	//Creating the methods for the card class. To be used when creating and manipulating the deck. This includes the getters and setters.
	
	public Card(int value, String name) {
		this.value = value;
		this.name = name;
		
	}
	
	public void describe() {
		System.out.println(name);
	}
	
	public int getValue() {
		return value;
	}
	
	public String getName() {
		return name;
	}
	
	public void setValue(int value) {
		this.value = value;
	}
	
	public void setName(String name) {
		this.name = name;
	}

}
