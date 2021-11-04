package likemetovote.app.election;

import likemetovote.app.election.candidate.UninominalCandidate;
import likemetovote.app.election.candidate.GroupCandidate;

public class Vote {
	protected Type type;
	protected UninominalCandidate uninominalCandidate;
	protected Symbol symbol;
	protected java.util.List<GroupCandidate> preferences;
	protected boolean disjointed;
	protected boolean yes;
	protected boolean no;
	
	public Vote() {
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

	/**
	 * @return the uninominalCandidate
	 */
	public UninominalCandidate getUninominalCandidate() {
		return uninominalCandidate;
	}

	/**
	 * @param uninominalCandidate the uninominalCandidate to set
	 */
	public void setUninominalCandidate(UninominalCandidate uninominalCandidate) {
		this.uninominalCandidate = uninominalCandidate;
	}

	/**
	 * @return the symbol
	 */
	public Symbol getSymbol() {
		return symbol;
	}

	/**
	 * @param symbol the symbol to set
	 */
	public void setSymbol(Symbol symbol) {
		this.symbol = symbol;
	}

	/**
	 * @return the preferences
	 */
	public java.util.List<GroupCandidate> getPreferences() {
		return preferences;
	}

	/**
	 * @param preferences the preferences to set
	 */
	public void setPreferences(java.util.List<GroupCandidate> preferences) {
		this.preferences = preferences;
	}

	/**
	 * @return the disjointed
	 */
	public boolean isDisjointed() {
		return disjointed;
	}

	/**
	 * @param disjointed the disjointed to set
	 */
	public void setDisjointed(boolean disjointed) {
		this.disjointed = disjointed;
	}

	/**
	 * @return the yes
	 */
	public boolean isYes() {
		return yes;
	}

	/**
	 * @param yes the yes to set
	 */
	public void setYes(boolean yes) {
		this.yes = yes;
	}

	/**
	 * @return the no
	 */
	public boolean isNo() {
		return no;
	}

	/**
	 * @param no the no to set
	 */
	public void setNo(boolean no) {
		this.no = no;
	}
	
	
}
