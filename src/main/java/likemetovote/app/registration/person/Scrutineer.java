package likemetovote.app.registration.person;

public class Scrutineer extends User{	
	public Scrutineer() {
		type = Role.SCRUTINEER;
		roles.add(Role.USER);
		roles.add(Role.SCRUTINEER);
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
