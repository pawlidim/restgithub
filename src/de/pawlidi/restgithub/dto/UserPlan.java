package de.pawlidi.restgithub.dto;

import java.io.Serializable;

import com.google.gson.annotations.SerializedName;

public class UserPlan implements Serializable {

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

}
