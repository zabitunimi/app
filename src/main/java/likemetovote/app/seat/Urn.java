package likemetovote.app.seat;

import likemetovote.app.election.Card;

class Urn {
	protected long id;
	protected java.util.List<Card> cards;
	
	protected Type type;
	
	public Urn() {}
	public void deposits(Card c) {
		
	}
	
	public void picksup(Card c) {
		
	}
	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}
	/**
	 * @return the cards
	 */
	public java.util.List<Card> getCards() {
		return cards;
	}
	/**
	 * @param cards the cards to set
	 */
	public void setCards(java.util.List<Card> cards) {
		this.cards = cards;
	}
	/**
	 * @return the type
	 */
	public Type getType() {
		return type;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(Type type) {
		this.type = type;
	}
	
	
}
