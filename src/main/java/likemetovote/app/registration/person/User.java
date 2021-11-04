package likemetovote.app.registration.person;

class User {
	protected String firstname;
	protected String lastname;
	protected String idIdentityCard;
	protected String province;
	protected String municipality;
	protected Role type;
	protected java.util.List<Role> roles;
	
	public User() {
		type = Role.USER;
		roles.add(Role.USER);
	}

	/**
	 * @return the firstname
	 */
	public String getFirstname() {
		return firstname;
	}

	/**
	 * @param firstname the firstname to set
	 */
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	/**
	 * @return the lastname
	 */
	public String getLastname() {
		return lastname;
	}

	/**
	 * @param lastname the lastname to set
	 */
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	/**
	 * @return the idIdentityCard
	 */
	public String getIdIdentityCard() {
		return idIdentityCard;
	}

	/**
	 * @param idIdentityCard the idIdentityCard to set
	 */
	public void setIdIdentityCard(String idIdentityCard) {
		this.idIdentityCard = idIdentityCard;
	}

	/**
	 * @return the province
	 */
	public String getProvince() {
		return province;
	}

	/**
	 * @param province the province to set
	 */
	public void setProvince(String province) {
		this.province = province;
	}

	/**
	 * @return the municipality
	 */
	public String getMunicipality() {
		return municipality;
	}

	/**
	 * @param municipality the municipality to set
	 */
	public void setMunicipality(String municipality) {
		this.municipality = municipality;
	}

	/**
	 * @return the type
	 */
	public Role getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(Role type) {
		this.type = type;
	}

	/**
	 * @return the roles
	 */
	public java.util.List<Role> getRoles() {
		return roles;
	}

	/**
	 * @param roles the roles to set
	 */
	public void setRoles(java.util.List<Role> roles) {
		this.roles = roles;
	}
	
	
	
	
	
}
