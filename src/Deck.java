import java.util.ArrayList;
import java.util.Collections;

public class Deck {

	/*
	 * INSTANCE VARIABLES
	 */

	private final ArrayList<Card> deck = new ArrayList<Card>(); // arraylist of
																// 52 cards.

	/*
	 * CONSTRUCTORS 
	 */
	
	/**
	 * Deck constructor creates a new array list of 52 unique cards, just like a
	 * playing card deck, and shuffles them in a random order.
	 * 
	 * @param screenRes
	 *            The screen resolution of the Cards in the deck.
	 */
	public Deck(int screenRes) {

		// SPADES
		for (int i = 1; i <= 13; i++) {
			deck.add(new Card(Suit.SPADE, i, screenRes));
		}
		// CLUBS
		for (int i = 1; i <= 13; i++) {
			deck.add(new Card(Suit.CLUB, i, screenRes));
		}
		// HEARTS
		for (int i = 1; i <= 13; i++) {
			deck.add(new Card(Suit.HEART, i, screenRes));
		}
		// DIAMONDS
		for (int i = 1; i <= 13; i++) {
			deck.add(new Card(Suit.DIAMOND, i, screenRes));
		}
		shuffle();
	}
	
	/*
	 * PUBLIC METHODS
	 */

	/**
	 * shuffles the order of the deck using Collection's shuffle method
	 */
	public void shuffle() {
		Collections.shuffle(deck);
	}

	/**
	 * Prints out every card in the deck, used primarily for testing purposes
	 * 
	 * @return Every card in the deck.
	 */
	public String toString() {
		return deck.toString();
	}

	/**
	 * Creates a new hand and adds thirteen new cards to it, starting where the
	 * index is.
	 * 
	 * @return A new hand with thirteen cards in it
	 */
	public Hand dealHand() {
		Hand myHand = new Hand();
		int index = 0;

		while (index < 13) {
			myHand.add(deck.remove(0));
			index++;
		}

		return myHand;
	}
}
