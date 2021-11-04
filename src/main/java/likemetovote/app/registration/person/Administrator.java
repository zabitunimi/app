package likemetovote.app.registration.person;

public class Administrator extends User {
	
	public Administrator() {
		type = Role.ADMINISTRATOR;
		roles.add(Role.USER);
		roles.add(Role.ADMINISTRATOR);
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
	
	public void nomination(User u, java.util.List<Role> roles ) {
		
	}
	
	
}
