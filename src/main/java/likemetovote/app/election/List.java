package likemetovote.app.election;
import likemetovote.app.election.candidate.UninominalCandidate;


class List {
	protected UninominalCandidate uninominalCandidate;
	protected java.util.List<Group> groups;
	
	public List() {}

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
	 * @return the groups
	 */
	public java.util.List<Group> getGroups() {
		return groups;
	}

	/**
	 * @param groups the groups to set
	 */
	public void setGroups(java.util.List<Group> groups) {
		this.groups = groups;
	}
	
	
}
