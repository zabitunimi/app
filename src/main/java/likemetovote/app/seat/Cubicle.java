package likemetovote.app.seat;

import likemetovote.app.election.Vote;
import likemetovote.app.registration.person.Voter;

class Cubicle {
	protected long id;
	protected StateCubicle state;
	
	public Cubicle() {
		state = StateCubicle.FREE;
	}
	
	public void enter() {}
	
	public void exit() {}
	
	public void vote(Voter v, java.util.List<Vote> votes) {}

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
	 * @return the state
	 */
	public StateCubicle getState() {
		return state;
	}

	/**
	 * @param state the state to set
	 */
	public void setState(StateCubicle state) {
		this.state = state;
	}
	
	
}
