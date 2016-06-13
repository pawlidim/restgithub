package de.pawlidi.restgithub.dto;

import java.io.Serializable;
import java.util.Date;

import com.google.gson.annotations.SerializedName;

public class User implements Serializable {

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
	private String name;
	private String company;
	private String blog;
	private String location;
	private String email;
	private Boolean hireable;
	private String bio;
	@SerializedName("public_repos")
	private Long publicRepos;
	@SerializedName("public_gists")
	private Long publicGists;
	private Long followers;
	private Long following;
	@SerializedName("created_at")
	private Date created;
	@SerializedName("updated_at")
	private Date updated;
	@SerializedName("total_private_repos")
	private Long totalPrivateRepos;
	@SerializedName("owned_private_repos")
	private Long ownedPrivateRepos;
	@SerializedName("private_gists")
	private Long privateGists;
	@SerializedName("disk_usage")
	private Long diskUsage;
	@SerializedName("collaborators")
	private Long collaborators;
	private UserPlan plan;

	private User() {
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
	 * @return the company
	 */
	public String getCompany() {
		return company;
	}

	/**
	 * @param company
	 *            the company to set
	 */
	public void setCompany(String company) {
		this.company = company;
	}

	/**
	 * @return the blog
	 */
	public String getBlog() {
		return blog;
	}

	/**
	 * @param blog
	 *            the blog to set
	 */
	public void setBlog(String blog) {
		this.blog = blog;
	}

	/**
	 * @return the location
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * @param location
	 *            the location to set
	 */
	public void setLocation(String location) {
		this.location = location;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email
	 *            the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the hireable
	 */
	public Boolean getHireable() {
		return hireable;
	}

	/**
	 * @param hireable
	 *            the hireable to set
	 */
	public void setHireable(Boolean hireable) {
		this.hireable = hireable;
	}

	/**
	 * @return the bio
	 */
	public String getBio() {
		return bio;
	}

	/**
	 * @param bio
	 *            the bio to set
	 */
	public void setBio(String bio) {
		this.bio = bio;
	}

	/**
	 * @return the publicRepos
	 */
	public Long getPublicRepos() {
		return publicRepos;
	}

	/**
	 * @param publicRepos
	 *            the publicRepos to set
	 */
	public void setPublicRepos(Long publicRepos) {
		this.publicRepos = publicRepos;
	}

	/**
	 * @return the publicGists
	 */
	public Long getPublicGists() {
		return publicGists;
	}

	/**
	 * @param publicGists
	 *            the publicGists to set
	 */
	public void setPublicGists(Long publicGists) {
		this.publicGists = publicGists;
	}

	/**
	 * @return the followers
	 */
	public Long getFollowers() {
		return followers;
	}

	/**
	 * @param followers
	 *            the followers to set
	 */
	public void setFollowers(Long followers) {
		this.followers = followers;
	}

	/**
	 * @return the following
	 */
	public Long getFollowing() {
		return following;
	}

	/**
	 * @param following
	 *            the following to set
	 */
	public void setFollowing(Long following) {
		this.following = following;
	}

	/**
	 * @return the created
	 */
	public Date getCreated() {
		return created;
	}

	/**
	 * @param created
	 *            the created to set
	 */
	public void setCreated(Date created) {
		this.created = created;
	}

	/**
	 * @return the updated
	 */
	public Date getUpdated() {
		return updated;
	}

	/**
	 * @param updated
	 *            the updated to set
	 */
	public void setUpdated(Date updated) {
		this.updated = updated;
	}

	/**
	 * @return the totalPrivateRepos
	 */
	public Long getTotalPrivateRepos() {
		return totalPrivateRepos;
	}

	/**
	 * @param totalPrivateRepos
	 *            the totalPrivateRepos to set
	 */
	public void setTotalPrivateRepos(Long totalPrivateRepos) {
		this.totalPrivateRepos = totalPrivateRepos;
	}

	/**
	 * @return the ownedPrivateRepos
	 */
	public Long getOwnedPrivateRepos() {
		return ownedPrivateRepos;
	}

	/**
	 * @param ownedPrivateRepos
	 *            the ownedPrivateRepos to set
	 */
	public void setOwnedPrivateRepos(Long ownedPrivateRepos) {
		this.ownedPrivateRepos = ownedPrivateRepos;
	}

	/**
	 * @return the privateGists
	 */
	public Long getPrivateGists() {
		return privateGists;
	}

	/**
	 * @param privateGists
	 *            the privateGists to set
	 */
	public void setPrivateGists(Long privateGists) {
		this.privateGists = privateGists;
	}

	/**
	 * @return the diskUsage
	 */
	public Long getDiskUsage() {
		return diskUsage;
	}

	/**
	 * @param diskUsage
	 *            the diskUsage to set
	 */
	public void setDiskUsage(Long diskUsage) {
		this.diskUsage = diskUsage;
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

	/**
	 * @return the plan
	 */
	public UserPlan getPlan() {
		return plan;
	}

	/**
	 * @param plan
	 *            the plan to set
	 */
	public void setPlan(UserPlan plan) {
		this.plan = plan;
	}

}
