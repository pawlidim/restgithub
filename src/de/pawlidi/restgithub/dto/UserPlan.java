package de.pawlidi.restgithub.dto;

import com.google.gson.annotations.SerializedName;

public class UserPlan extends RestDTO {

	private String name;
	private Long space;
	@SerializedName("private_repos")
	private Long privateRepos;
	private Long collaborators;

	private UserPlan() {
		super();
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the space
	 */
	public Long getSpace() {
		return space;
	}

	/**
	 * @param space
	 *            the space to set
	 */
	public void setSpace(Long space) {
		this.space = space;
	}

	/**
	 * @return the privateRepos
	 */
	public Long getPrivateRepos() {
		return privateRepos;
	}

	/**
	 * @param privateRepos
	 *            the privateRepos to set
	 */
	public void setPrivateRepos(Long privateRepos) {
		this.privateRepos = privateRepos;
	}

	/**
	 * @return the collaborators
	 */
	public Long getCollaborators() {
		return collaborators;
	}

	/**
	 * @param collaborators
	 *            the collaborators to set
	 */
	public void setCollaborators(Long collaborators) {
		this.collaborators = collaborators;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!super.equals(obj)) {
			return false;
		}
		if (!(obj instanceof UserPlan)) {
			return false;
		}
		UserPlan other = (UserPlan) obj;
		if (name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!name.equals(other.name)) {
			return false;
		}
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return name;
	}

}
