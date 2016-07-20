package de.pawlidi.restgithub.dto;

import com.google.gson.annotations.SerializedName;

public class RepositoryOwner extends RestDTO {

	private String login;
	private Long id;
	@SerializedName("avatar_url")
	private String avatar;
	@SerializedName("gravatar_id")
	private String gravatarId;
	private String url;
	@SerializedName("html_url")
	private String urlHTML;
	@SerializedName("followers_url")
	private String urlFollowers;
	@SerializedName("following_url")
	private String urlFollowing;
	@SerializedName("gists_url")
	private String urlGists;
	@SerializedName("starred_url")
	private String urlStarred;
	@SerializedName("subscriptions_url")
	private String urlSubscriptions;
	@SerializedName("organizations_url")
	private String urlOrganizations;
	@SerializedName("repos_url")
	private String urlRepos;
	@SerializedName("events_url")
	private String urlEvents;
	@SerializedName("received_events_url")
	private String urlReceivedEvents;
	private String type;
	@SerializedName("site_admin")
	private Boolean admin;

	private RepositoryOwner() {
		super();
	}

	/**
	 * @return the login
	 */
	public String getLogin() {
		return login;
	}

	/**
	 * @param login
	 *            the login to set
	 */
	public void setLogin(String login) {
		this.login = login;
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the avatar
	 */
	public String getAvatar() {
		return avatar;
	}

	/**
	 * @param avatar
	 *            the avatar to set
	 */
	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	/**
	 * @return the gravatarId
	 */
	public String getGravatarId() {
		return gravatarId;
	}

	/**
	 * @param gravatarId
	 *            the gravatarId to set
	 */
	public void setGravatarId(String gravatarId) {
		this.gravatarId = gravatarId;
	}

	/**
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * @param url
	 *            the url to set
	 */
	public void setUrl(String url) {
		this.url = url;
	}

	/**
	 * @return the urlHTML
	 */
	public String getUrlHTML() {
		return urlHTML;
	}

	/**
	 * @param urlHTML
	 *            the urlHTML to set
	 */
	public void setUrlHTML(String urlHTML) {
		this.urlHTML = urlHTML;
	}

	/**
	 * @return the urlFollowers
	 */
	public String getUrlFollowers() {
		return urlFollowers;
	}

	/**
	 * @param urlFollowers
	 *            the urlFollowers to set
	 */
	public void setUrlFollowers(String urlFollowers) {
		this.urlFollowers = urlFollowers;
	}

	/**
	 * @return the urlFollowing
	 */
	public String getUrlFollowing() {
		return urlFollowing;
	}

	/**
	 * @param urlFollowing
	 *            the urlFollowing to set
	 */
	public void setUrlFollowing(String urlFollowing) {
		this.urlFollowing = urlFollowing;
	}

	/**
	 * @return the urlGists
	 */
	public String getUrlGists() {
		return urlGists;
	}

	/**
	 * @param urlGists
	 *            the urlGists to set
	 */
	public void setUrlGists(String urlGists) {
		this.urlGists = urlGists;
	}

	/**
	 * @return the urlStarred
	 */
	public String getUrlStarred() {
		return urlStarred;
	}

	/**
	 * @param urlStarred
	 *            the urlStarred to set
	 */
	public void setUrlStarred(String urlStarred) {
		this.urlStarred = urlStarred;
	}

	/**
	 * @return the urlSubscriptions
	 */
	public String getUrlSubscriptions() {
		return urlSubscriptions;
	}

	/**
	 * @param urlSubscriptions
	 *            the urlSubscriptions to set
	 */
	public void setUrlSubscriptions(String urlSubscriptions) {
		this.urlSubscriptions = urlSubscriptions;
	}

	/**
	 * @return the urlOrganizations
	 */
	public String getUrlOrganizations() {
		return urlOrganizations;
	}

	/**
	 * @param urlOrganizations
	 *            the urlOrganizations to set
	 */
	public void setUrlOrganizations(String urlOrganizations) {
		this.urlOrganizations = urlOrganizations;
	}

	/**
	 * @return the urlRepos
	 */
	public String getUrlRepos() {
		return urlRepos;
	}

	/**
	 * @param urlRepos
	 *            the urlRepos to set
	 */
	public void setUrlRepos(String urlRepos) {
		this.urlRepos = urlRepos;
	}

	/**
	 * @return the urlEvents
	 */
	public String getUrlEvents() {
		return urlEvents;
	}

	/**
	 * @param urlEvents
	 *            the urlEvents to set
	 */
	public void setUrlEvents(String urlEvents) {
		this.urlEvents = urlEvents;
	}

	/**
	 * @return the urlReceivedEvents
	 */
	public String getUrlReceivedEvents() {
		return urlReceivedEvents;
	}

	/**
	 * @param urlReceivedEvents
	 *            the urlReceivedEvents to set
	 */
	public void setUrlReceivedEvents(String urlReceivedEvents) {
		this.urlReceivedEvents = urlReceivedEvents;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type
	 *            the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

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

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((login == null) ? 0 : login.hashCode());
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
		if (!(obj instanceof User)) {
			return false;
		}
		User other = (User) obj;
		if (id == null) {
			if (other.getId() != null) {
				return false;
			}
		} else if (!id.equals(other.getId())) {
			return false;
		}
		if (login == null) {
			if (other.getLogin() != null) {
				return false;
			}
		} else if (!login.equals(other.getLogin())) {
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
		return login;
	}
}
