package likemetovote.app.seat;

import likemetovote.app.registration.person.Administrator;
import likemetovote.app.registration.person.Voter;

public class Seat {
	protected long id;
	protected State state;
	protected java.util.Date dateOpen;
	protected java.util.Date dateClose;
	protected java.util.List<Cubicle> cubicles;
	protected java.util.List<Urn> urns;
	protected java.util.List<Voter> voters;
	protected java.util.List<Administrator> administrators;
	public Seat() {} 
	
	public boolean open() {
		//todo
		return true;
	}
	
	public boolean close() {
		return true;
	}
	
	public boolean isOpen() {
		return true;
	}
	
	public boolean isClose() {
		return true;
	}
	
	public void configure() {
		
	}
	
	public void enter(Voter v) {
		
	}
	
	public void exit(Voter v) {
		
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
	 * @return the dateOpen
	 */
	public java.util.Date getDateOpen() {
		return dateOpen;
	}

	/**
	 * @param dateOpen the dateOpen to set
	 */
	public void setDateOpen(java.util.Date dateOpen) {
		this.dateOpen = dateOpen;
	}

	/**
	 * @return the dateClose
	 */
	public java.util.Date getDateClose() {
		return dateClose;
	}

	/**
	 * @param dateClose the dateClose to set
	 */
	public void setDateClose(java.util.Date dateClose) {
		this.dateClose = dateClose;
	}

	/**
	 * @return the cubicles
	 */
	public java.util.List<Cubicle> getCubicles() {
		return cubicles;
	}

	/**
	 * @param cubicles the cubicles to set
	 */
	public void setCubicles(java.util.List<Cubicle> cubicles) {
		this.cubicles = cubicles;
	}

	/**
	 * @return the urns
	 */
	public java.util.List<Urn> getUrns() {
		return urns;
	}

	/**
	 * @param urns the urns to set
	 */
	public void setUrns(java.util.List<Urn> urns) {
		this.urns = urns;
	}

	/**
	 * @return the voters
	 */
	public java.util.List<Voter> getVoters() {
		return voters;
	}

	/**
	 * @param voters the voters to set
	 */
	public void setVoters(java.util.List<Voter> voters) {
		this.voters = voters;
	}

	/**
	 * @return the administrators
	 */
	public java.util.List<Administrator> getAdministrators() {
		return administrators;
	}

	/**
	 * @param administrators the administrators to set
	 */
	public void setAdministrators(java.util.List<Administrator> administrators) {
		this.administrators = administrators;
	}
	
	
}
