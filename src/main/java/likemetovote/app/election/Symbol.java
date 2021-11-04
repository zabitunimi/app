package likemetovote.app.election;

import likemetovote.app.election.candidate.Candidate;

class Symbol {
	protected String name;
	protected java.util.List<Candidate> candidates;
	
	public Symbol() {}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the candidates
	 */
	public java.util.List<Candidate> getCandidates() {
		return candidates;
	}

	/**
	 * @param candidates the candidates to set
	 */
	public void setCandidates(java.util.List<Candidate> candidates) {
		this.candidates = candidates;
	}
	
	
	
}
