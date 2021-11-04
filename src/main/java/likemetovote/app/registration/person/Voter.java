package likemetovote.app.registration.person;
import java.util.List;
import  likemetovote.app.election.Card;

public class Voter extends User{

	protected State state;
	protected String idElectoralCard;
	protected List<Card> cards;
	
	public Voter() {
		state = State.NOT_VOTED;
	}
	
	/**
	 * @return the state
	 */
	public State getState() {
		return state;
	}

	/**
	 * @param state the state to set
	 */
	public void setState(State state) {
		this.state = state;
	}

	/**
	 * @return the idElectoralCard
	 */
	public String getIdElectoralCard() {
		return idElectoralCard;
	}

	/**
	 * @param idElectoralCard the idElectoralCard to set
	 */
	public void setIdElectoralCard(String idElectoralCard) {
		this.idElectoralCard = idElectoralCard;
	}

	/**
	 * @return the cards
	 */
	public List<Card> getCards() {
		return cards;
	}

	/**
	 * @param cards the cards to set
	 */
	public void setCards(List<Card> cards) {
		this.cards = cards;
	}
	/**
	 * @return the cards
	 * schede bianche
	 */
	public List<Card> getBlankCards() {
		//todo 
		return cards;
	}
	
	/**
	 * @return the cards
	 * schede votate
	 */
	public List<Card> getVotedCards() {
		//todo
		return cards;
	}

}
