import java.util.ArrayList;

public class Memory {

	/*
	 * INSTANCE VARIABLES
	 */

	private final ArrayList<Card> memory; // array list of cards already played
											// this round

	/*
	 * CONSTRUCTORS
	 */

	/**
	 * Memory constructor creates an array list that can store cards.
	 */
	public Memory() {
		memory = new ArrayList<Card>();
	}

	/*
	 * PUBLIC METHODS
	 */

	/**
	 * Adds a card to the memory using arrayList's add method
	 * 
	 * @param card
	 *            The card to be added to memory.
	 */
	public void add(Card card) {
		memory.add(card);
	}

	/**
	 * Clears all the memory using arrayList's clear method
	 */
	public void clear() {
		memory.clear();
	}

	/**
	 * Checks to see if a certain card is in the memory.
	 * 
	 * @param c
	 *            The card to check.
	 * @return True if it is in the memory, else false.
	 */
	public boolean contains(Card c) {
		for (int i = 0; i < memory.size(); i++) {
			if (memory.get(i).getNumber() == c.getNumber() && memory.get(i).getSuit() == c.getSuit()) {
				return true;
			}
		}
		return false;
	}

}
