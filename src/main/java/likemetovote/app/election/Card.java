package likemetovote.app.election;
import java.util.List;

public class Card {
	protected State state;
	protected List<likemetovote.app.election.List> lists;
	protected PermittedVote permittedVote;
	protected Vote vote;
	
	public Card() {
		state = State.CLOSE;
		permittedVote = null;
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
	 * @return the lists
	 */
	public List<likemetovote.app.election.List> getLists() {
		return lists;
	}

	/**
	 * @param lists the lists to set
	 */
	public void setLists(List<likemetovote.app.election.List> lists) {
		this.lists = lists;
	}

	/**
	 * @return the permittedVote
	 */
	public PermittedVote getPermittedVote() {
		return permittedVote;
	}

	/**
	 * @param permittedVote the permittedVote to set
	 */
	public void setPermittedVote(PermittedVote permittedVote) {
		this.permittedVote = permittedVote;
	}

	/**
	 * @return the vote
	 */
	public Vote getVote() {
		return vote;
	}

	/**
	 * @param vote the vote to set
	 */
	public void setVote(Vote vote) {
		this.vote = vote;
	}
	
}
