package de.pawlidi.restgithub.dto;

import java.io.Serializable;

public class RepositoryPermissions implements Serializable {

	private Boolean admin;
	private Boolean push;
	private Boolean pull;

	/**
	 * @return the admin
	 */
	public Boolean getAdmin() {
		return admin;
	}

	/**
	 * @param admin
	 *            the admin to set
	 */
	public void setAdmin(Boolean admin) {
		this.admin = admin;
	}

	/**
	 * @return the push
	 */
	public Boolean getPush() {
		return push;
	}

	/**
	 * @param push
	 *            the push to set
	 */
	public void setPush(Boolean push) {
		this.push = push;
	}

	/**
	 * @return the pull
	 */
	public Boolean getPull() {
		return pull;
	}

	/**
	 * @param pull
	 *            the pull to set
	 */
	public void setPull(Boolean pull) {
		this.pull = pull;
	}

}
